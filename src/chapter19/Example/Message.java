package chapter19.Example;

public class Message {
	
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	@Override
	public String toString() {
		if(command.equals("sendMail")) {
			return to + "님에게 메일을 보냅니다";
		}else if(command.equals("sendSMS")) {
			return to + "님에게 SMS을 보냅니다";
		}else if(command.equals("sendKakaotalk")) {
			return to + "님에게 카카오톡을 보냅니다";
		}
		return null;
		
	}
	
}
