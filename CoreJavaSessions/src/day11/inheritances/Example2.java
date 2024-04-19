package day11.inheritances;
class Testing{
	//default  cons	
	protected void calling() {
		System.out.println("calling from Testing");
	}
	int age=25;
}
public class Example2 extends Testing{
	//default  cons, default super()

	public static void main(String[] args) {
		Example2 e1=new Example2();
		e1.display();
	}
	void display() {
		System.out.println("I am display method on Example2");
		calling();
		System.out.println("age: "+age);
//		Testing s1=new Testing();
//		s1.calling();
//		System.out.println("Testing age: "+s1.age);
		super.calling();
		System.out.println("Testing age: "+super.age);
	}
	//overried method
	public void calling() {
		System.out.println("Calling from Example1");
	}
	int age=35;
}
/*
super keyword:
	known as super/parent class instance
	used inside non-static method/constructor to access parent class non-static members
	when parent class and child non-static member name are same



overridning: 
	when we try to declare a method(non-static) in child class which is already present in parent dn that method
	will be known overrided method
	For overriding inheritance is mandatory
	
	while overriding method signature should be same only its visibility can be increased
		default --> default/protected/public
		protected --> protected/public
		public --> public
	
	method can;t be overried:
		private method
		static method
		variables can't be overried
		constructor can't be overried
*/