package day16.typecasting;
class ManualTesting{
	void testingTypes() {
		System.out.println("Here you will learn type of testing");
	}	
}
class AutomationTesting extends ManualTesting{
	void coreJava() {
		System.out.println("Here you will learn core java concepts");
	}
}
public class NonPrimitiveCasting extends AutomationTesting{

	public static void main(String[] args) {
		NonPrimitiveCasting n1=new NonPrimitiveCasting();
		n1.calling();
		n1.coreJava();
		n1.testingTypes();
		
		//up-casting ---> Implicit/Auto --> AutomationTesting a1=(AutomationTesting)new NonPrimitiveCasting();
		//AutomationTesting a1=new NonPrimitiveCasting();
				//or
		//AutomationTesting a1=n1;//Implicit/Auto --> AutomationTesting a1=n1=new NonPrimitiveCasting();
		AutomationTesting a1=(AutomationTesting)n1;//up casting-explicit
		a1.coreJava();
		a1.testingTypes();
		
		//ManualTesting m1=n1;//Implicit/Auto --> ManualTesting a1=n1=new NonPrimitiveCasting();
		ManualTesting m1=(ManualTesting)n1;//up casting-explicit
		m1.testingTypes();
		
		//down casting - directly is not possible
		//NonPrimitiveCasting ref=new ManualTesting();
		
		//down casting should be done only for up-casted object
		NonPrimitiveCasting ref=(NonPrimitiveCasting)m1;
		ref.calling();
		ref.coreJava();
		ref.testingTypes();
	}
	
	void calling() {
		System.out.println("I am calling you... ");
	}

}
