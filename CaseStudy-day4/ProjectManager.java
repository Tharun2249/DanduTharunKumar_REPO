package day4Assign;

public class ProjectManager extends PermanentEmp{

	public ProjectManager(String name, int experience) {
		super(name, experience);
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return 10000*experience;
	}

	@Override
	public double mediclainCover() {
		// TODO Auto-generated method stub
		return calSalary();
	}
	
	

}

