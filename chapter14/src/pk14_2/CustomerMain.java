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
		Buy buyer = customer;//��ĳ����
		buyer.buy();
		buyer.order();//�������̵� �� order ���
		
		System.out.println("----Sell----");
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if( buyer instanceof Customer) {//�ٿ�ĳ����
			
			Customer customer2 = (Customer)seller;
			System.out.println("----DownCasting----");
			customer2.sell();
			customer2.buy();
			
		}
		
		System.out.println("---Customer---");
		customer.order();
	}

}
