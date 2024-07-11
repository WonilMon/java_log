package chapter17_Generic;

public abstract class GenericMaterial {
	
	public abstract void doPrinting();
	
}

//=========================================

class Plastic extends GenericMaterial {
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
}

//=========================================

class Powder extends GenericMaterial {
	
	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
	
}

//=========================================

class ObjectTest {
	
	//1. 상속받은 것들을 받아주기 위해서 기존에는 여기서 상위클래스를 잡아준 후에
	private GenericMaterial m;

	//-----------------------------------
	public GenericMaterial getM() {
		return m;
	}

	public void setM(GenericMaterial m) {
		this.m = m;
	}
	//-----------------------------------	
}

//==========================================
