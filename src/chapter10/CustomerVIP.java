package chapter10;

public class CustomerVIP extends Customer{
	
	private int agentID;
	private double saleRatio;
	
	public CustomerVIP (int id, String name, int agentID) {
		super(id, name); //부모가 가지고 있는 오버로딩 생성자에 값을 주입
		setCustomerGrade("VIP");
		setBonusRatio(0.05);
		this.agentID = agentID;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price - (int)(price*saleRatio))*bonusRatio; 
		return (price - (int)(price*saleRatio)); //할인율이 적용된 물건가격
	}//calcPrice
	
	@Override
	public String showCustomer() {
		return super.showCustomer() + "+\n전문상담원은 " + agentID + "입니다";
	}//showCustomer
	//---------------------------------------chapter11, OverringTest02용
	public int getAgentID() {
		return agentID;
	}
	//---------------------------------------
}
