package chapter10.Example;

import java.util.Scanner;

public class PublicTransportSystem {
	
	Scanner scan = new Scanner(System.in);
	Bus bus;
	Subway subway;
	Customer [] customer;
	
	public PublicTransportSystem () { //만드는 순간 생성
		bus = new Bus();
		subway = new Subway();
		System.out.print("승객의 수를 등록하세요 >> ");
		int count = Integer.parseInt(scan.nextLine());
		customer = new Customer[count];	 //count개의 배열을 준거고
		for(int i=0; i<customer.length;i++) {
			customer[i] = new Customer(); //각각의 배열방에 각 고객의 주소를 담는 작업을 한 것 
			//customer[i]로 내가 무엇을 할건지 뭐가 담기는지 역추적해보기
		}
		
	}//생성자
	
	public void operate() {
		
		while (true) {
			
			System.out.print("1.승객등록 | 2.대중교통 이용 | 3.승객정보 | 4.대중교통 정보 | 5.종료 >> ");
			int num = Integer.parseInt(scan.nextLine());
			
			if(num==1) {
				registerCustomer();
			}else if(num==2) {
				useTransport();
			}else if(num==3) {
				Customer cs = searchCustomer();
				if(cs!=null) {
					cs.disp();
				}else {
					System.out.println("등록된 회원이 없습니다");
				}
			}else if(num==4) {
				
				PublicTransport pt = selectTransport(); 
				//업캐스팅
				//그럼 자식의 버스나 지하철의 주소값이 pt안으로 들어간 것, 버스/지하철에 따라 주소값이 바뀌겠죠
				//가지고 있는 메서드는 같다. take라는 부모의 메서드를 상속해서 쓰고있잖아요
				//selectTransport를 사용하면 주소값에 따라 아버지가 가진 take 메서드를 버스/지하철의 take로 사용된다
				pt.disp(); 
				// 버스를 받으면 버스의 disp가 수행되겠죠 (지하철이면 지하철의 disp)
			
			}else if(num==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1~5까지의 번호만 선택해주세요");
			}
			
		}//while
	}//operate
	
	public void registerCustomer() {
		for (int i = 0 ; i < customer.length ; i++) {
			System.out.print("승객의 이름을 등록하세요 : ");
				customer[i].setName(scan.nextLine());
			System.out.print("승객의 소지금을 등록하세요 : ");
				customer[i].setMoney(Integer.parseInt(scan.nextLine()));
			System.out.println("----------------------------------------");
		}
	}//registCustomer
	
	public void useTransport () {
		
		Customer cs = searchCustomer(); 
		//'Customer cs' 고객의 주소가 만들어진거지 cs는 아무것도 없는 상태 
		//이거 그냥 고객이름 반환하는, 주소값만 담는 참조변수죠?
		//배열에 있는 주소값을 cs에 담는다
		if(cs!=null) {
			
			PublicTransport pt = selectTransport(); 
			//pt라는 깡통하나 만들어서 selectTransport 실행
			//1번이냐 2번에 따라 선택 되겠죠
			
			cs.ride(pt);
										
		}else {
			System.out.println("잘못된 번호를 선택하셨습니다");
		}
		
	}//useTransport
	
	public Customer searchCustomer() { 
		// !! customer의 메서드임 반환값 역시 Customer의 것
		// while로 반복 뺑뺑 돌려서 return값 찾아서 반환
		
		while (true) {
			System.out.print("승객의 이름을 검색하세요 >> ");
			String name = scan.nextLine();
			for(int i=0; i<customer.length;i++) {
				if(customer[i].getName().equals(name)) {
					return customer[i];
				}
			}
			System.out.println("회원정보가 없습니다");
			return null;
		}
	}//searchCustomer
	
	public PublicTransport selectTransport() {
		//반환값을 부모클래스로 잡아놓으면 자식도 리턴이 가능하니까
		//자식인 '버스'나 '서브웨이'를 반환하는 것 
		
		System.out.print("버스는 1번, 지하철은 2번을 선택하세요 >> ");
		int num = Integer.parseInt(scan.nextLine());
		
		if(num==1) {
			return bus;
		}else if (num==2) {
			return subway;
		}else {
			System.out.println("잘못된 번호를 선택하셨습니다");
			return null;
		}
	}//selectTransport
}

//--------------------------------------------------------
//--------------------------------------------------------

class Customer {
	
	String name;
	int money;
	
	public void ride(PublicTransport pt) { //중요, 부모를 넣었을 때 자식이 다른 행위를 할 수 있게 (복습)
		if(money >= pt.fare) {
			pt.take();
			money -= pt.fare;
			System.out.println(name + "님의 남은 소지금은 " + money + "원 입니다");
		}else {
			System.out.println(name + "님의 소지금이 부족합니다");
		}		
	}//ride
	
	public void disp () {
		System.out.println(name + "님의 소지금은 " + money + "원 입니다");
	}

	//-----------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	//-----------------------------------------------------------------
	
}

//--------------------------------------------------------
//--------------------------------------------------------

class PublicTransport { //부모클래스
	
	int fare; //요금
	int count; //승객
	int money; //수익
	
	//부모가 만들어지면 (부모의)생성자인 이곳에 fare라는 값을 담는 것 (ex.버스의 2000)
	public PublicTransport(int fare) { 
		this.fare = fare;
	}
	
	public void take() {
		count++;
		money+=fare;
	}
	
	public void disp () {
		System.out.println("이용고객 수 : " + count + " | 수익 : " + money);
	}
	
	
}

//--------------------------------------------------------
//--------------------------------------------------------

class Bus extends PublicTransport{
	
	//버스라는 공간이 만들어졌다는것은 부모인 대중교통도 같이 주소가 만들어진것
	//그래서 만들어지자마자 부모를 모셔서 거기 2000이라는 값을 넣은 (부모의)생성자를 실행
	public Bus() { 
		super(2000);
	}
	
	@Override
	public void take() {
		//count++;
		//money+=fare;
		super.take();
		System.out.println("버스를 이용합니다");
	}
	
	@Override
	public void disp() {
		System.out.print("버스의 ");
		super.disp();
	}
	
}

//--------------------------------------------------------
//--------------------------------------------------------

class Subway extends PublicTransport{
	
	public Subway() {
		super(1500);
	}
	
	@Override
	public void take() {
		//count++;
		//money+=fare;
		super.take();
		System.out.println("지하철을 이용합니다");
	}
	
	@Override
	public void disp() {
		System.out.print("지하철의 ");
		super.disp();
	}
	
}






