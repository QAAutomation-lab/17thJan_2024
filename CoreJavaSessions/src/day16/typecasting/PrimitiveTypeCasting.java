package day16.typecasting;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		int num1=25;		
		double num2=num1;//widening - implicit/Auto--> double num2=(double)num1;
		float num3=(float)num1;//widening - explicit		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
		
		double salary=25000.65;
		int sal1=(int)salary;//narrowing- explicit --> data and memory both
		float sal2=(float)salary;//narrowing- explicit--> memory both
		long sal3=(long)salary;//narrowing - explicit--> data loss	
		
		System.out.println("salary: "+salary);
		System.out.println("sal1: "+sal1);
		System.out.println("sal2: "+sal2);
		System.out.println("sal3: "+sal3);
		
		addition(25, 10);
		addition(25.36f, 10);
		
		System.out.println(getSum(10, 25));
	}
	
	public static int getSum(double num1, double num2) {//implicit widening
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		double sum=num1+num2;
		return (int)sum;//narrowing-explicit
	}
	
	public static void addition(double num1, int num2) {//double num1=25;(implicit widening) | int num2=10
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		double sum=num1+num2;
		System.out.println("Sum :"+sum);
	}
}
