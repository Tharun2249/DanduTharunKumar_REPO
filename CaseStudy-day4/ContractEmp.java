package day4Assign;

public class ContractEmp extends Employee {

	protected int wages;
	protected int hours;
	
	public ContractEmp(String name, int experience, int wages, int hours) {
		super(name, experience);
		this.wages = wages;
		this.hours = hours;
	}
	@Override
	public double mediclainCover() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		if (hours<=40) {
			return wages*hours;
		}
		else {
			return 40*wages+(hours-40)*wages*2;
		}
		
	}
	
	
	
	
	
	

}
