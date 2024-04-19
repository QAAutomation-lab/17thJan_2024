package day17.poly;
class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class Runtime {
	public static void main(String args[]) {
		Animal A = new Animal();//no runtime poly as there is no inheritance
		A.eat();// Animals Eat
		herbivores h1=new herbivores();//no runtime poly as there is no upcasting
		h1.eat();
		
		Animal h = new herbivores(); // yes, inheritance, upcasting and overriding
		h.eat();// 
		Animal o = new omnivores(); // yes, inheritance, upcasting and overriding
		o.eat();// 
		Animal c = new carnivores(); // yes, inheritance, upcasting and overriding
		c.eat();//
	}
}
/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */