package chapter09;

public class Family {

	private static Family instance = new Family();
	
	private Family () {}
	
	public static Family getInstance() {
		if(instance==null) {
			instance = new Family();
		}
		return instance;
	}
}
