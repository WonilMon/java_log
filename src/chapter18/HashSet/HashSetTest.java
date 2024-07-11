package chapter18.HashSet;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		//HashSet 
		//중복값을 허용 XX (ArrayList 는 하지 못하는것)
		
	HashSet<String> hash = new HashSet<String>();
	
	hash.add(new String ("김씨"));
	hash.add(new String ("조씨"));
	hash.add(new String ("정씨"));
	hash.add(new String ("홍씨"));
	hash.add(new String ("유씨"));
	hash.add(new String ("유씨"));
	hash.add(new String ("유씨"));
	hash.add(new String ("유씨"));
	
	System.out.println(hash);
		System.out.println(hash);
	}
}


