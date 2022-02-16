package com.mouritech.springbootsecuritywithrolesceo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/updatemanagersalary")
	public String ceo() {
		return "<h2> Welcome CEO!!!!</h2><p>Only CEO can update manager salary</p>";
	}
	
	@GetMapping("/updatestockandgeneratereports")
	public String updatestockandgeneratereports() {
		return "<h2> Welcome CEO/Manager!!!!</h2><p>Only CEO/manager can updatestockandgeneratereports</p>";
	}
	
	@GetMapping("/updatestaffsalary")
	public String updatestaffsalary() {
		return "<h2> Welcome CEO/Manager!!!!</h2><p>Only CEO/manager can updatestaffsalary</p>";
	}
	
	@GetMapping("/updateemailandmobno")
	public String updateemailandmobno() {
		return "<h2> Welcome EveryOne!!!!</h2><p>EveryOne can update updateemailandmobno</p>";
	}

	@GetMapping("/all")
	public String all() {
		return "<h2> Welcome All!!!!</h2>";
	}

}
