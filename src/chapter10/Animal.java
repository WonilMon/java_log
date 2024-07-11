package chapter10;

public class Animal {
	
	int leg = 4;
	
	void makeSound () {
		System.out.println("동물이 소리를 냅니다");
	}
	
}

class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("멍멍멍멍 으르릉 웤웤 월월 앍앍 그릉그릉");
	}
}

class Cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("야옹 니야옹 냐아아아옹 미야옹 잉잉 야옹");
	}
}
