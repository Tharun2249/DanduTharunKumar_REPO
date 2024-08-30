package day4Assign;

abstract class Employee {
	protected String name;
	protected int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Employee(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}
	public abstract double mediclainCover();
	public abstract double calSalary();
	

}
