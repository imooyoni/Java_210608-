package pk12;

import test.Customer;
import test.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "������", 2000); //>>�ɹ������� Ŀ����ӿ� �� �÷��ΰ� 
		vc.bonusPoint=1000; //CustomerŸ���̹Ƿ� Customer������ ��� //���̾����� Ŀ����ӿ� �߰� ������ �ɹ����� Ȥ�� �������̵��� ���� vip�� ����
		
		System.out.println(vc.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "�Դϴ�");
		
	}
}
