package chapter19.Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import chapter19.HashMap.Student;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest3 {
	
	private Map<Product, Integer> productMap; 						// Integer 은 수량
	Scanner scan = new Scanner(System.in);
	String name;
	int price;
	int count;
	Product pro = null;
	
	public HashMapTest3 () {
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
				
				if(productMap.containsKey(pro)) {
					System.out.print("중복된 상품이 있습니다. 가격을 변경하시겠습니까? (Y/N) >>");
					String choice = scan.nextLine().toUpperCase();
					if(choice.equals("Y")) {
						System.out.println("상품을 등록하였습니다");
						productMap.remove(pro);						// 엄밀히 말하면 덮어씌우는게 아니라 value 값이 덮어씌워짐
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

				
			}else if (select == 2) {
				
				if(mapNullCheck()) {continue;}	
				//true, false 반환
				//true 가 반환되면 continue 로 다시 while 로 돌아감
				
				System.out.print("삭제할 상품 이름 : ");
				name = scan.nextLine();
				pro = searchProduct(name);							// 값이 없어서 Null 값을 받으면 수행이 안되니까
				if(productNullCheck()) {continue;}					// 삭제할 name 이 serachProduct 메서드를 통해서 없는게 확인되면 탈출
				
				Set<Map.Entry<Product, Integer>> entrySet = productMap.entrySet();
				Iterator<Map.Entry<Product, Integer>> entryIt = entrySet.iterator();
				while(entryIt.hasNext()) {
					Map.Entry<Product, Integer> entry = entryIt.next();
					Product key = entry.getKey(); 					
					Integer value = entry.getValue();
					if(key.getName().equals(name)) {
						productMap.remove(key);
					}
				}

			}else if (select == 3) {
				
				if(mapNullCheck()) {continue;}	
				
				Set<Map.Entry<Product, Integer>> entrySet = productMap.entrySet();
				Iterator<Map.Entry<Product, Integer>> entryIt = entrySet.iterator();
				while(entryIt.hasNext()) {
					Map.Entry<Product, Integer> entry = entryIt.next();
					Product key = entry.getKey(); 					
					Integer value = entry.getValue();
					System.out.println(key + "\t 수량 : " + value);		
				}
			}else if (select == 4) {
				
				if(mapNullCheck()) {continue;}	
				
				System.out.print("검색할 상품 이름 : ");
				name = scan.nextLine();
				pro = searchProduct(name);	
				if(productNullCheck()) {continue;}
				
				Set<Map.Entry<Product, Integer>> entrySet = productMap.entrySet();
				Iterator<Map.Entry<Product, Integer>> entryIt = entrySet.iterator();
				while(entryIt.hasNext()) {
					Map.Entry<Product, Integer> entry = entryIt.next();
					Product key = entry.getKey(); 					
					Integer value = entry.getValue();
					if(name.equals(key.getName())) {
					System.out.println(key + "\t 수량 : " + value);	
					}
				}
				
			}else if (select == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1~5까지의 번호만 입력 가능합니다");
			}
		}//while
	}//run
	
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
	
}//class

//====================================================================================

class Product {
	
	private String name;
	private int price;
	
	public Product (String name, int price) {
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
		Product other = (Product) obj;
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