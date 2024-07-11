package chapter10.Example;

public class AnimalMain {

	public static void main(String[] args) {
		
		/*
		AnimalMain aTest = new AnimalMain();
		Human h = new Human();
		Tiger t = new Tiger();
		Eggle e = new Eggle();
		
		aTest.moveAnimal(h);
		aTest.moveAnimal(t);
		aTest.moveAnimal(e);
		*/
		
		AnimalMain aTest = new AnimalMain();
		Human h = new Human();
		
		aTest.moveAnimal(h);
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());

	}//main
	
	public void moveAnimal (Animal ani) {
		
		ani.move();
		
	}

}//class
