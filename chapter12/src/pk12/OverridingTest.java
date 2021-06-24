package pk12;

//라이브러리
import test.Customer;
import test.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "이순신");
		//Car c=new Car(); 프로젝트가 다르면 참조가 되지 않음!
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		System.out.println("---------vip----------");
		
		Customer customerKim=new VIPCustomer(10020, "김유신",01);
		customerKim.bonusPoint=10000;
		int price = 10000;
		int kimPrice = customerKim.calcPrice(price);
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println(customerLee.getCustomerName()+" 님이 지불하신 금액은 " + customerLee.calcPrice(price) + "원 입니다.");
		System.out.println(customerKim.getCustomerName()+" 님이 지불하신 금액은 " + kimPrice + "원 입니다.");
		
		
	}

}
