package pk11;

import java.util.Scanner;

public class CustomerMain {
	
	public static void main(String[] args) {

		int ci=0;
		int ai=0;
		int price=0;
		String name=null;
		String grade=null;
		
		Scanner scan = new Scanner(System.in);
		Customer cu = new Customer();
		
		System.out.print("ȸ����ȣ�� �Է����ּ��� >");
		cu.setCustomerID(scan.nextInt());
		System.out.print("ȸ������ �Է����ּ��� >");
		cu.setCustomerName(scan.next());
		System.out.print("ȸ������� �Է����ּ��� >");
		cu.setCustomerGrade(scan.next());
		
		ci=cu.getCustomerID();
		name=cu.getCustomerName();
		grade=cu.getCustomerGrade();
		cu.bonusPoint=0;
		
		
		if ( cu.getCustomerGrade().equals("VIP")) {
			VIPCustomer vip= new VIPCustomer(ci, name, ai);
			System.out.print("���Ŵ��� ��ȣ�� �Է����ּ��� >");	
			vip.agentID=scan.nextInt();
			ai=vip.getAgentID();
			System.out.print("��ǰ ������ �Է��ϼ��� >");
			vip.price = scan.nextInt();
			vip.calcPrice(price);
			System.out.println();
			System.out.println("--- �Է¿Ϸ� ---");
			System.out.println();
			
			cu=vip;
			System.out.println(vip.showCustomerInfo());
			System.out.println("�����ݾ��� "+vip.calcPrice(price) + "�� �Դϴ�.");
		}
		else if (cu.getCustomerGrade().equals("SILVER")) {
			System.out.print("��ǰ ������ �Է��ϼ��� >");
			cu.price=scan.nextInt();
			System.out.println();
			System.out.println("--- �Է¿Ϸ� ---");
			System.out.println();
			
			cu.calcPrice(price);
			System.out.println(cu.showCustomerInfo());
			System.out.println("�����ݾ��� " + cu.calcPrice(price) + "�� �Դϴ�.");
		}
		else {
			
		}
	}
}

