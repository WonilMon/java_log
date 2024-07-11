package chapter19.Example;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		//Stack : 후입선출
		
		Stack<Object> stack = new Stack<Object>();
		
		stack.push(500);
		stack.push(100);
		stack.push(50);
		stack.push(10);	//10
		stack.push(10);	//10
		stack.push(10);	//10
		
		while(!stack.isEmpty()) {
			System.out.println("코인박스에서 꺼낸 동전 : " + stack.pop());
		}
		
		//=================< Coin 이용해서 강사님이 짜신 코드 >=================
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("코인 박스에서 꺼낸 동전 : " + coin.getValue());
		}
		

	}

}
