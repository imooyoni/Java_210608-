package pk11;

public class CustomerTest {

	public static void main(String[] args) {

		//�Ϲݰ� ���� (Customer)
		System.out.println("----------SILVER----------");
		Customer customerLee=new Customer();//�� ���, ������
		customerLee.setCustomerID(1004);
		customerLee.setCustomerName("ȫ�浿");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price); //���ʽ� ����Ʈ�� ����
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName()+"���� "+leePrice+"���� �����߽��ϴ�.");
		
		System.out.println("----------VIP----------");
		//Customer customerKim=new VIPCustomer(1001, "����ȣ", 1004);//�ڵ���ĳ����
		VIPCustomer vipLee=new VIPCustomer(1004, "��浿", 01);
		int goPrice = vipLee.calcPrice(price);
		System.out.println(vipLee.showCustomerInfo());
		System.out.println(vipLee.getCustomerName()+"���� "+goPrice+"���� �����߽��ϴ�.");
		
	}

}
