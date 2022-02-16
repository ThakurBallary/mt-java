package com.mouritech.springbootsecuritywithrolesceo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	private static final String CEO = "CEO";
	private static final String MANAGER = "MANAGER";
	private static final String SALESPERSON = "SALESPERSON";
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/updatemanagersalary").hasRole(CEO)
								 .antMatchers("/updatestockandgeneratereports").hasAnyRole(CEO,MANAGER)
								 .antMatchers("/updatestaffsalary").hasAnyRole(CEO,MANAGER)
								 .antMatchers("/updateemailandmobno").hasAnyRole(CEO,MANAGER,SALESPERSON)
								 .antMatchers("/all").permitAll()
								 .and().formLogin();
		}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
