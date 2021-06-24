package pk11;

public class CustomerTest {

	public static void main(String[] args) {

		//일반고객 정보 (Customer)
		System.out.println("----------SILVER----------");
		Customer customerLee=new Customer();//고객 등급, 적립률
		customerLee.setCustomerID(1004);
		customerLee.setCustomerName("홍길동");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price); //보너스 포인트가 쌓임
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName()+"님이 "+leePrice+"원을 지불했습니다.");
		
		System.out.println("----------VIP----------");
		//Customer customerKim=new VIPCustomer(1001, "김태호", 1004);//자동업캐스팅
		VIPCustomer vipLee=new VIPCustomer(1004, "고길동", 01);
		int goPrice = vipLee.calcPrice(price);
		System.out.println(vipLee.showCustomerInfo());
		System.out.println(vipLee.getCustomerName()+"님이 "+goPrice+"원을 지불했습니다.");
		
	}

}
