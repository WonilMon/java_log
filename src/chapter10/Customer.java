package chapter10;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected double bonusPoint;
	protected double bonusRatio;
	
	public Customer () { //Class가 만들어지는 순간 부여됨
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}//생성자
	
	public Customer (int id, String name) {
		customerID = id;
		customerName = name;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}//오버로딩 생성자
	
	public int calcPrice (int price) {
		bonusPoint += (price*bonusRatio);
		return price;
	}//calcPrice
	
	public String showCustomer() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "원 입니다";
 	}//showCustomer

	
	//---------------------------------------------------------
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	//---------------------------------------------------------
	
}//Customer

//-----------------------------------------------------------------------

















