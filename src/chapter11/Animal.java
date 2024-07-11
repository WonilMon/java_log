package chapter11;

public class Animal {
	
	private int eye = 2;
	private int leg = 4;
	
	//--------------------
	public int getEye() {
		return eye;
	}
	public int getLeg() {
		return leg;
	}
	//--------------------
}

//=============================================================

class Bear extends Animal {
	
	String woong = "웅담";
	
}

//=============================================================

class Lion extends Animal {
	
	String galgi = "갈기";
	
}

//=============================================================

class Spider extends Animal {
	
	String web = "거미줄";
	
	@Override
	public int getEye() {
		return 8;
	}
	
	@Override
	public int getLeg() {
		return 8;
	}
	
}
