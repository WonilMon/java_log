package chapter14;

public class CatMain_Object01 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
		action(cat);
		action(dog);
		
	}
	
	public static void action (Object obj) { //멤버변수를 Object 타입으로
		if(obj instanceof Dog) { //"Dog 라는 클래스가 obj 에 소속되어 있으면" 라는 뜻
			Dog dog = (Dog) obj;
			dog.sound();
		}else if(obj instanceof Cat) {
			Cat cat = (Cat) obj;
			cat.move();
		}
	}

}
