package PROJECTS;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}

	@Override
	public String work() {
    	return "I`m busy bossing everyone around";
    }
	
}
