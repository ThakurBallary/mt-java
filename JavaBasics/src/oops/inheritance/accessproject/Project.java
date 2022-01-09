package oops.inheritance.accessproject;

import oops.inheritance.accessemp.CEO;

public class Project extends CEO {
	
	public int id;
	protected int[] tasksId;
	private int[] access;
	public String name;
	
	public Project() {
		System.out.println("Project default constructor");
	}
	
	public Project(int id, String name, String CeoName) {
		System.out.println("Project parameterised constructor");
		this.id = id;
		this.name = name;
		super.name = CeoName;
	}
	
	protected String getCeoName() {
		return super.name;
	}
	
	public int[] getTasksId() {
		return tasksId;
	}
	
	public void setTasksId(int[] tasksId) {
		this.tasksId = tasksId;
	}
	
	public int[] getAccess() {
		return access;
	}
	
	public void setAccess(int[] access) {
		this.access = access;
	}

}
