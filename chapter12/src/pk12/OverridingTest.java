package pk12;

//���̺귯��
import test.Customer;
import test.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "�̼���");
		//Car c=new Car(); ������Ʈ�� �ٸ��� ������ ���� ����!
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		System.out.println("---------vip----------");
		
		Customer customerKim=new VIPCustomer(10020, "������",01);
		customerKim.bonusPoint=10000;
		int price = 10000;
		int kimPrice = customerKim.calcPrice(price);
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println(customerLee.getCustomerName()+" ���� �����Ͻ� �ݾ��� " + customerLee.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(customerKim.getCustomerName()+" ���� �����Ͻ� �ݾ��� " + kimPrice + "�� �Դϴ�.");
		
		
	}

}
