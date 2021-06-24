package pk12;

import test.Customer;
import test.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000); //>>맴버변수는 커스토머에 다 올려두고 
		vc.bonusPoint=1000; //Customer타입이므로 Customer변수방 사용 //브이아이피 커스토머에 추가 선언한 맴버변수 혹은 오버라이딩한 값만 vip에 저장
		
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "입니다");
		
	}
}
