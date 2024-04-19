package day12.abstractions;
abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
class abstractClass1{
	public static void main(String args[]) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); //we cann't create an object of abstract class as it is incomplete class
		Bike1 b2=new Honda4();	
		b2.run();
		b2.speed(20);
		//b2.color();
	}
}
/*
Debugging:	running program step by step(line by line)
1. add break point into required step(double click on number or right click on required line number and click toggle break point)
2. use shortcuts
		for next line - F6
		to go inside method - F5
		to get return value or variable value  - ctrl+shift+i
		if you are done with require step execution and you want to continue the program execution  - F8

*/