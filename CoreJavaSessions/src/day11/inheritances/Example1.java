package day11.inheritances;
class Sample1{
	//default  cons	
	protected void calling() {
		System.out.println("calling from Sample1");
	}
	int getNumber() {
		return 25;
	}
}
public class Example1 extends Sample1{
	//default  cons, default super()

	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.calling();
		System.out.println(e1.getNumber());
		
		Sample1 s1=new Sample1();
		s1.calling();
		System.out.println(s1.getNumber());
		
		Sample1 s2=new Example1();
		s2.calling();
		System.out.println(s2.getNumber());
	}
	//overried method
	public void calling() {
		System.out.println("Calling from Example1");
	}
	int getNumber() {
		return -20;
	}
}
/*
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