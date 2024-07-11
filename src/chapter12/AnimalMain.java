package chapter12;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		//----------------------------
		animalSound(dog);
		animalSound(cat);
	}
	
	//--------------------------------다형성을 이용해서
	
	public static void animalSound(Animal a) {
		a.sound();
	}
}
