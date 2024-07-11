package chapter07.Example;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명을 생성
		Student studentJames = new Student("James", 12000);
		Student studentTom = new Student("Tom", 10000);
		//값 두개를 넘기고있으니까 Student(class)에 오버로딩,문자값 저장 - 1
		
		//버스 2대 생성
		Bus bus100 = new Bus(100);
		Bus bus987 = new Bus(987);
		
		//지하철 2대 생성
		Subway subwayGreen = new Subway("2호선");
		Subway subwayOrange = new Subway("3호선");
		
		studentJames.showInfo(); //제임스 학생의 잔액
		
		studentJames.takeBus(bus100); //버스 100번의 승객수 증가, 수익증가 1000원
		//student에 takebus 만들어야겠죠 (수익을 증가시키고 학생돈 지출을 표현) - 2
	
		studentJames.showInfo(); //제임스 학생의 잔액
		
		bus100.showInfo(); //버스 100번의 승객 수, 수익 확인
		
		System.out.println("------------------------------------");
		studentTom.showInfo(); //톰 학생의 잔액
		
		studentTom.takeBus(bus987); //버스 987번의 승객수 증가, 수익증가 1000원
		studentTom.takeSubway(subwayGreen); //지하철 2호선의 승객수 증가, 수익증가 1500원
	
		studentTom.showInfo(); //톰 학생의 잔액
		
		bus987.showInfo(); //버스 987번의 승객 수, 수익 확인
		subwayGreen.showInfo(); //지하철 2호선의 승객 수, 수익 확인
		
	}

}
