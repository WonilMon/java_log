package chapter10.Example;

public class Animal {
	
	public void move () {
		System.out.println("동물이 움직입니다.");
	}//move
	
}//class
//---------------------------------------------------
	class Human extends Animal {
		@Override
		public void move() {
			System.out.println("사람이 두발로 걷습니다");
		}
	}
//---------------------------------------------------
	class Tiger extends Animal {
		@Override
		public void move() {
			System.out.println("호랑이가 네발로 뛰어다닙니다");
		}
	}
//---------------------------------------------------
	class Eagle extends Animal {
		@Override
		public void move() {
			System.out.println("독수리가 하늘을 납니다");
		}
	}