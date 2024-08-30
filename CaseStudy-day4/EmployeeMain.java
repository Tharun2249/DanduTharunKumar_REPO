package day4Assign;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee pm=new ProjectManager("Alice",5);
		Employee pta=new PTechnicalAssociate("Bob",3,4);
		Employee cta=new ContractEmp("Tharun",2,20,45);
		System.out.println("Project manager salary : "+pm.calSalary());
		System.out.println("Project manager Mediclaim : "+pm.mediclainCover());
		
		System.out.println("Permanent Tech Associate Salary: "+pta.calSalary());
		System.out.println("Permanent Tech Associate Mediclaim Cover: "+pta.mediclainCover());

		System.out.println("Contract Technica assocate Employee Salary: "+cta.calSalary());
		System.out.println("Contract Technica Associate Mediclaim Cover: "+cta.mediclainCover());


	}

}
