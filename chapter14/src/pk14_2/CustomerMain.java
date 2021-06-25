package pk14_2;

public class CustomerMain {

	public static void main(String[] args) {
		/*
		Buy a = new Customer();
		a.buy();
		a.order();
		
		Sell b = new Customer();
		b.sell();
		
		Customer c = new Customer();
		c.order();
		*/
		
		Customer customer = new Customer();
		System.out.println("----Buy----");
		Buy buyer = customer;//업캐스팅
		buyer.buy();
		buyer.order();//오버라이딩 된 order 출력
		
		System.out.println("----Sell----");
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if( buyer instanceof Customer) {//다운캐스팅
			
			Customer customer2 = (Customer)seller;
			System.out.println("----DownCasting----");
			customer2.sell();
			customer2.buy();
			
		}
		
		System.out.println("---Customer---");
		customer.order();
	}

}
