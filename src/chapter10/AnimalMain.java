package chapter10;

public class AnimalMain {

	
	public static void main(String[] args) {
	
		Animal ani = new Animal();
		ani.makeSound();
		
		System.out.println("-------------------");
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
		System.out.println(dog.leg);
		System.out.println(cat.leg);
		
		
		
	}
	
}
