package day15.encapsulations;
class AutomationDemo20{
	private int age=25;
	private double salary=45000;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
public class Testing2 {

	public static void main(String[] args) {
		// access non-static member of AutomationDemo class
		AutomationDemo20 a1=new AutomationDemo20();
		
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
