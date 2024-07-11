package chapter14.Clone;

public class PersonMain  {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person person1 = new Person("김윤석", 24);
		
		Person person2 = (Person) person1.clone();
		
		System.out.println("기존 Person1 객체" + person1);
		System.out.println("복사 Person2 객체" + person2);
		
		System.out.println("person1의 기존 해시코드 : " + person1.hashCode());
		System.out.println("person2의 복사 해시코드 : " + person2.hashCode());
		
		System.out.println("person1과 person2는 같습니까? : " + person1.equals(person2));
		
	}
}
