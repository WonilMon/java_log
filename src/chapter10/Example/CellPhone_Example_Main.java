package chapter10.Example;

import java.util.Scanner;

public class CellPhone_Example_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("모델 : ");
		String model = scan.nextLine();
		
		System.out.print("색상 : ");
		String color = scan.nextLine();
		
		System.out.print("채널 : ");
		int chan = Integer.parseInt(scan.nextLine());
		
		DmbCellPhone_Example dmb = new DmbCellPhone_Example(model, color, chan);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("자기자신 : 안녕하세요");
		dmb.reveiveVoice("상대방 : 점심 뭐 먹을까요");
		dmb.sendVoice("자기자신 : 라면 ㄱ?");
		dmb.hangUp();
		
		System.out.println("--------------------");
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(600);
		dmb.turnOffDmb();
		dmb.powerOff();
		
		System.out.println("--------------------");
		
		CellPhone_Example cell = new CellPhone_Example();
		cell.color = "파랑";
		cell.powerOn();
		System.out.println("바꾼 색 : " + cell.color);
		cell.powerOff();
	}

}
