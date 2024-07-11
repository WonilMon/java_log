package chapter19.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import chapter19.HashMap.Student;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest4 {
	
	private Map<Product, Integer> productMap; 						// Integer 은 수량
	Scanner scan = new Scanner(System.in);
	String name;
	int price;
	int count;
	Product pro = null;
	
	public HashMapTest4 () {
		productMap = new HashMap<Product, Integer>();
	}
	
	public void run() {
		
		while (true) {
			
			System.out.println("=====================================================");
			System.out.println("1. 상품등록 | 2. 상품삭제 | 3. 상품목록 | 4. 상품검색 | 5. 종료");
			System.out.println("=====================================================");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if (select == 1) {
				System.out.print("상품이름 : ");
				name = scan.nextLine();
				System.out.print("상품가격 : ");
				price = Integer.parseInt(scan.nextLine());
				System.out.print("수량 : ");
				count = Integer.parseInt(scan.nextLine());
	
				pro = new Product(name, price);
				
				addProduct(pro, count);
				
			}else if (select == 2) {
				
				if(mapNullCheck()) {continue;}	
				//true, false 반환
				//true 가 반환되면 continue 로 다시 while 로 돌아감

				System.out.print("삭제할 상품 이름 : ");
				name = scan.nextLine();
				pro = searchProduct(name);							//값이 없어서 Null 값을 받으면 수행이 안되니까
				
				if(productNullCheck()) {continue;}
				
				productMap.remove(pro);								// 여기서도 Null 떠서 continue 진행되면 remove 는 실행안됨. 이런식으로 IF문 활용

			}else if (select == 3) {
				
				if(mapNullCheck()) {continue;}	
				
				listProduct(select);								// 4번을 위해 아무 의미없는 3번을 넣어줄게요
				
			}else if (select == 4) {
				
				if(mapNullCheck()) {continue;}	
				
				System.out.print("검색할 상품 이름 : ");
				name = scan.nextLine();
				pro = searchProduct(name);	
				
				if(productNullCheck()) {continue;}
																	// listProduct ( 전체목록 나오는 메서드 ) 를 이용해서 하나만 뽑아오도록
				listProduct(select); 								// 그러려면 약간 수정해야겠죠?
				
			}else if (select == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1~5까지의 번호만 입력 가능합니다");
			}
		}//while
	}//run
	
	public void addProduct (Product pro, int count) {
		
		productMap.put(pro, count);
		
		if(productMap.containsKey(pro)) {
			System.out.print("중복된 상품이 있습니다. 가격을 변경하시겠습니까? (Y/N) >>");
			String choice = scan.nextLine().toUpperCase();   		//toUpperCase를 해놓으면 대소문자 구별없이
			if(choice.equals("Y")) {
				System.out.println("상품을 등록하였습니다");
				productMap.remove(pro);
				productMap.put(pro, count);
			}else if(choice.equals("N")) {
				System.out.println("등록을 취소하셨습니다");
			}else {
				System.out.println("잘못입력하셨습니다");
			}
		}else {
			System.out.println("상품을 등록하였습니다");
			productMap.put(pro, count);
		}
		
	}//addProduct
	
	public boolean mapNullCheck () {
		
		if(productMap.size() == 0) {
			System.out.println("등록된 상품이 하나도 없습니다");
			return true;
		}else {
			return false;
		}
		
	}//mapNullCheck
	
	public Product searchProduct(String name) {
		for(Product p : productMap.keySet()) {
			if(p.getName().equals(name)) {
				return p;
			}
		}return null;
	}//searchProduct
	
	public boolean productNullCheck () {
		if(pro==null) {
			System.out.println("해당하는 상품이 없습니다");
			return true;
		}else {
			return false;
		}
	}//productNullCheck
	
	public void listProduct (int select) {
		Set<Product> keySet = productMap.keySet();
		Iterator<Product> keyIt = keySet.iterator();
		
		while (keyIt.hasNext()) {
			Product key = keyIt.next();
			Integer value = productMap.get(key);
			
			//하나만 뽑는 거 추가 ↓
			if(select == 4) {
				if(key.getName().equals(pro.getName())) {
					System.out.println(key + " 수량 : " + value);
					break;
				}
			}
			//하나만 뽑는 거 추가 ↑
			
			System.out.println(key + " 수량 : " + value);
		}
	}
	
}//class

//====================================================================================

class Product4 {
	
	private String name;
	private int price;
	
	public Product4 (String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "상품이름 : " + name + "\t 가격 : " + price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product4 other = (Product4) obj;
		return Objects.equals(name, other.name);
	}
	
	//----------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//----------------------------------
	
}//class