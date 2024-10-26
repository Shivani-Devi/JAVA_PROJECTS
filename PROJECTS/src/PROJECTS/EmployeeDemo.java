package PROJECTS;

import java.util.Random;

public class EmployeeDemo {
	private enum EmployeeType{
		WORKER,
		MANAGER
	}
	
	public static void main(String [] args) {
		Employee[] employees = new Employee[5];
//		employees[0] = new Worker("MICHALLE", "OBSTRU", 25);
//		employees[1] = new Worker("EI","THU",23);
//		employees[2] = new Manager("SHIAVNI","DEVI",20);
//		employees[3] = new Worker("SHRUTHI", "PRASANT",23);
//		employees[4] = new Manager("MARKUS","OLBRICH",31);
//		
//		printEmployees(employees);
		for (int i=0; i<5;i++) {
			EmployeeType et = getEmployeeType();
			Employee currentEmployee;
			
			if(et==EmployeeType.WORKER) {
				currentEmployee= new Worker("JOHN","BAUGH",39);
			}
			else{
				currentEmployee = new Manager("SAME","SMITH",45);
			}
			employees[i]=currentEmployee;
		}
		printEmployees(employees);
		
	}
	
	public static void printEmployees(Employee[] employees) {
		for(Employee e1: employees) {
			System.out.println("FIRST NAME: "+e1.getFirstName());
			System.out.println("LAST NAME: "+e1.getLastName());
			System.out.println("AGE: "+e1.getAge());
			System.out.println("WORK: "+e1.work());
			System.out.println();
		}
	}
	
	public static EmployeeType getEmployeeType() {
		EmployeeType result;
		Random rand  = new Random();
		final int UPPER_BOUND = 2;
		int whichOne =rand.nextInt(UPPER_BOUND); //  0 and 1
		if(whichOne == 0) {
			result = EmployeeType.WORKER;
		}
		else {
			result = EmployeeType.MANAGER;
		}
		
		return result;
	}

}
