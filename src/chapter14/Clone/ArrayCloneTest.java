package chapter14.Clone;

public class ArrayCloneTest {
	
	public static void main(String[] args) {
		
		int arr1 [] = {1,2,3,4,5};
		int arr2 [];
		
		arr2 = arr1.clone();
		
		System.out.println("복사된 arr2 배열");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		
		System.out.println("---------------------------");
		
		System.out.println("arr1 배열");
		arr2[3] = 0; //값을 집어넣어도 별개의 배열이기 때문에 영향 안미침
		for(int i :arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println("---------------------------");
		System.out.println("수정된 arr2 배열");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		
		
	}

}
