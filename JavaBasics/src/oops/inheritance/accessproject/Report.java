package oops.inheritance.accessproject;

import java.util.Date;

import oops.inheritance.accessemp.CEO;

public class Report extends CEO {
	
	private int time;
	private Date date;
	protected String task;
	public String project;
	
	public Report(String project) {
		System.out.println("Project report: " + project);
		this.project = project;
	}
	
	protected Report(Report report, CEO ceo) {
		System.out.println("Report copy constructor");
		this.time = report.time;
		this.date = report.date;
		this.task = report.task;
		this.project = report.project;
		super.name = ceo.name;
		super.setEmail(ceo.getEmail());
	}
	
	protected int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}

}
