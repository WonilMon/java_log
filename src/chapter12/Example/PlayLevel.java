package chapter12.Example;

public abstract class PlayLevel {
	
	public abstract void run () ;
	public abstract void jump () ;
	public abstract void turn () ;
	public abstract void showLevelmessage () ;
	
	public final void tem (int num) {
		run();
		for(int i=0; i<num; i++) {
			jump();
		}
		turn();
	}
	
}

//-------------------------------------------------

class Player {
	
	private PlayLevel level= new BeginerLevel();
	
	public Player () {
		level.showLevelmessage();
	}
	public void play (int num) {
		level.tem(num);
	}
	
	public void upgradeLevel (PlayLevel level) {
		this.level = level;
		level.showLevelmessage();
	}
	
}

//-------------------------------------------------

class BeginerLevel extends PlayLevel {
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("jump는 불가능합니다");
	}
	@Override
	public void turn() {
		System.out.println("turn은 불가능합니다");
	}
	@Override
	public void showLevelmessage() {
		System.out.println("***** 초보자 입니다 *****");
	}
	
}

//-------------------------------------------------

class AdvencedLevel extends PlayLevel {
	
	@Override
	public void run() {
		System.out.println("빨리 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("높이 jump를 합니다");
	}
	@Override
	public void turn() {
		System.out.println("turn은 불가능합니다");
	}
	@Override
	public void showLevelmessage() {
		System.out.println("***** 중급자 입니다 *****");
	}
	
	
}

//-------------------------------------------------

class SuperLevel extends PlayLevel {
	
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("아주 높이 jump를 합니다");
	}
	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다");
	}
	@Override
	public void showLevelmessage() {
		System.out.println("***** 고급자 입니다 *****");
	}
	
	
}





