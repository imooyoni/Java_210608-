package Exam;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		int n=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		n=scan.nextInt();
		
		
		int i=0;
		for(i=2; i<=n ; i++ ) {
			if(n % i == 0)
				break;
		}
		
		if(i==n ) {
			System.out.println(n + "��(��) �Ҽ� �Դϴ�.");
		} else {
			System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�.");
		}
	}

}
