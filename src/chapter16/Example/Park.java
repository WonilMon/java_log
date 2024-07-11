package chapter16.Example;

public class Park {
	
	private Car cars [];
	private int carCount;
	
	public Park(int count) {
		cars = new Car [count];
	}
	
	public void addCar (String model, String owner) {
		cars[carCount] = new Car(model,owner); //놓친것 : carCount
		carCount++;
	}//차량 추가
	
	public void showCarList () {
		
		System.out.println("=====주차된 차=====");
		
		for(int i=0;i<carCount;i++) {
			cars[i].showCarList();
		}
		
	}//주차된 차를 보여주는 메서드
	
	class Car {
		
		private String model;
		private String owner;
					
		public Car (String model, String owner) {
				this.model = model;
				this.owner = owner;
		}
				
		public void showCarList() {
				
			System.out.println("모델명 : " + model + "\t차주 : " + owner); //놓친것 : \t
			
		}
				
	}
}


	



	

