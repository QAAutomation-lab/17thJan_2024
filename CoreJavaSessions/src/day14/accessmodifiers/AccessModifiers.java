package day14.accessmodifiers;
class Demo{
	private int age=20;	//can't access from outside the class
	double salary=25000;//can't access from outside the package
	private void print() {
		System.out.println("Printing...");
	}
	public void display() {//can be access with in a package not from out side the package as its class declared default
		print();
		System.out.println("Salary: "+salary);
		System.out.println("Demo age: "+age);
	}
}
public class AccessModifiers {
	private int empId=123;
	int deptNo=23;
	protected int areaNum=411015;
	public int pin=210210;
	public static void main(String[] args) {		
		 Demo d=new Demo();
		 //System.out.println(d.age);
		 //d.print();
		 d.display();
		 System.out.println(d.salary);
		 AccessModifiers a=new AccessModifiers();
		 System.out.println("private: "+a.empId);
		 System.out.println("Default: "+a.deptNo);
		 System.out.println("protected: "+a.areaNum);
	}
}
