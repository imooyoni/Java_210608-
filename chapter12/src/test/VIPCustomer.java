package test;

public class VIPCustomer extends Customer{
	
	protected int agentID;
	double saleRatio;
	
	//전문상담원 agentID(정수)
	//10프로 세일 saleRatio 0.1
	//보너스 포인트
	
	//생성자 이용(고객의 아이디, 이름, 상담원넘버 설정) >> 오버라이딩 된 메소드 super사용
	//생성자 이용(등급 = vip, bonusratio=0.05, saleratio,)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//
		super(customerID, customerName); //customername이랑 customerid랑 같이 관리되어야 해서 슈퍼로 받음  
		this.agentID=agentID;//vip 클래서 내에서만 관리되면 되어서 this로 받음
		
		setCustomerGrade("VIP");
		bonusRatio=0.05;
		saleRatio=0.1;
	}

	//calcPrice = > 오버라이딩
	//return 가격할인값 출력
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price)-(int)(price*saleRatio);
		//가격을 반환해줌 - 할인받은 것만큼 빼줌
	}
	
	//1. 적립율 상속받아서 변경

	@Override
	public String showCustomerInfo() {
		//부모클래스의 메서드를 사용하고 상담원아이디 추가
		return super.showCustomerInfo() + "\n담당 상담원의 ID는 "+ agentID + "입니다.";
	}
	
	//상담원 아이디 리턴메서드 추가
	public int getAgentID() {
		return agentID;
	}
	
}
