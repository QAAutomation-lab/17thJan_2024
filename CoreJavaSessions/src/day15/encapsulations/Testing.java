package day15.encapsulations;
class AutomationDemo{
	private int age=25;
	private double salary=45000;
	
	/*
	 * getter: create a public method
	 * 		return type: should be same as required private variable datatype
	 * 		return value: should be required private variable 
	 * NOTE: with only getter method class become read only
	 */
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * setter: create a public method
	 * 		return type: should be void
	 * 		parameter: should be same as require private variable datatype
	 * 		return value: NA
	 * NOTE: with only setter method class become write only
	 */
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Testing {

	public static void main(String[] args) {
		// access non-static member of AutomationDemo class
		AutomationDemo a1=new AutomationDemo();
		
		//private members are not accessible from outside the class
//		System.out.println("private age variable of AutomationDemo class: "+a1.age);
//		System.out.println("private salary variable of AutomationDemo class: "+a1.salary);
		
		System.out.println("getting private age variable using getter of AutomationDemo class: "+a1.getAge());
		System.out.println("getting private salary variable using getter of AutomationDemo class: "+a1.getSalary());
		
		System.out.println("*************Updating private data member of AutomationDemo class using setters**********************");
		a1.setAge(50);
		a1.setSalary(55000);
		System.out.println("updated, getting private age variable using getter of AutomationDemo class: "+a1.getAge());
		System.out.println("updated, getting private salary variable using getter of AutomationDemo class: "+a1.getSalary());
		
	}

}
