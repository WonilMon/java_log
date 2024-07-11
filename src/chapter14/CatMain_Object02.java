package chapter14;

public class CatMain_Object02 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Object obj = new Object();  //Object 자신도 담을 수 있고
		
		Object objs [] = {dog, cat,obj}; //배열 안에 바로 담을 수도 있고
		
		Object objss [] = new Object[3];
		objss[0] = dog;
		objss[1] = cat;
		objss[2] = obj;
		
		size(objss);
	}
	
	public static void size(Object []obj) {
		System.out.println("전달된 객체의 수 " + obj.length);
	}
	
	
}
		