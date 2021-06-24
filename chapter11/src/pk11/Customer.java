package pk11;

public class Customer {

	//(포인트, 할인, 전담 매니저) 일반고객 < VIP
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected double bonusPoint;
	protected double bonusRatio; // 할인율
	protected int price;
	
	//생성자 ID, 네임 상속하기
	//생성될 때 Vip가 아니면
	public Customer() {//아이디랑 네임 없이 로그인
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	//오버라이딩 //회원가입 후 로그인
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	//메서드 포인트적립
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return price; //위에 식을 계산하고 다시 그대로 돌려줄게
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+" 이며,\n보너스포인트는 "+bonusPoint+"점 입니다.";
	}
	
	//10%할인, 5% 적립, 전문상담원
	
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
	
	
}
