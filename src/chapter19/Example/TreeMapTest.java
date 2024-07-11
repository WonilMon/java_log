package chapter19.Example;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	
	Map<Student, Integer> map;
	
	public TreeMapTest () {
		map = new TreeMap<Student, Integer>();
	}
	
	public void addStudent (Student stu, int num) {
		map.put(stu, num);
	}
	
	public void showInfo () {
		
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Student, Integer> m = entryIt.next();
			Student key = m.getKey();
			Integer value = m.getValue();
			System.out.println(key + "" + value);
		}
		
	}
	
	public boolean removeStudent (int sno) {
		
		Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			if(stu.getSno() == sno) {
				map.remove(stu);
				return true;
			}
			
		}
		System.out.println(sno + "가 존재하지 않습니다");
		return false;
		
	}
	
}
