package day4Assign;

public class PTechnicalAssociate extends PermanentEmp{

	private int certificates;

	public PTechnicalAssociate(String name, int experience, int certificates) {
		super(name, experience);
		this.certificates = certificates;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return 5000*experience+certificates*1000;
	}
	@Override
	public double mediclainCover() {
		return 2*calSalary();
		
	}
	

}
