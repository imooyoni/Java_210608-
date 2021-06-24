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
		
		System.out.print("회원번호를 입력해주세요 >");
		cu.setCustomerID(scan.nextInt());
		System.out.print("회원명을 입력해주세요 >");
		cu.setCustomerName(scan.next());
		System.out.print("회원등급을 입력해주세요 >");
		cu.setCustomerGrade(scan.next());
		
		ci=cu.getCustomerID();
		name=cu.getCustomerName();
		grade=cu.getCustomerGrade();
		cu.bonusPoint=0;
		
		
		if ( cu.getCustomerGrade().equals("VIP")) {
			VIPCustomer vip= new VIPCustomer(ci, name, ai);
			System.out.print("담당매니저 번호를 입력해주세요 >");	
			vip.agentID=scan.nextInt();
			ai=vip.getAgentID();
			System.out.print("제품 가격을 입력하세요 >");
			vip.price = scan.nextInt();
			vip.calcPrice(price);
			System.out.println();
			System.out.println("--- 입력완료 ---");
			System.out.println();
			
			cu=vip;
			System.out.println(vip.showCustomerInfo());
			System.out.println("결제금액은 "+vip.calcPrice(price) + "원 입니다.");
		}
		else if (cu.getCustomerGrade().equals("SILVER")) {
			System.out.print("제품 가격을 입력하세요 >");
			cu.price=scan.nextInt();
			System.out.println();
			System.out.println("--- 입력완료 ---");
			System.out.println();
			
			cu.calcPrice(price);
			System.out.println(cu.showCustomerInfo());
			System.out.println("결제금액은 " + cu.calcPrice(price) + "원 입니다.");
		}
		else {
			
		}
	}
}

