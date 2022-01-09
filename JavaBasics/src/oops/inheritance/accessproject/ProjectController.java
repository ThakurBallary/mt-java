package oops.inheritance.accessproject;

import oops.inheritance.accessemp.CEO;

public class ProjectController {

	public static void main(String[] args) {
		
		Project projectDefault = new Project();
		projectDefault.id = 1;
		System.out.println("Project id: " + projectDefault.id);
		
		Project projectParams = new Project(2, "ProjectManagement", "Surya");
		System.out.println("Project id: " + projectParams.id);
		System.out.println("Project name: " + projectParams.name);
		System.out.println("Project ceo: " + projectParams.getCeoName());
		
		Report reportParams = new Report(projectParams.name);
		reportParams.setTime(1000);
		reportParams.task = "login";
		reportParams.project = projectParams.name;
		
		CEO ceo = new CEO();
		ceo.name = "Arjun";
		ceo.setEmail("arjun@mt.com");
		
		Report reportCopy = new Report(reportParams, ceo);
		System.out.println("Report time: " + reportCopy.getTime());
		System.out.println("CEO email: " + reportCopy.getEmail());

	}

}
