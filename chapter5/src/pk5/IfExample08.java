package pk5;

import java.util.Scanner;

public class IfExample08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		//new�� ��(�� ���� �ν��Ͻ� ����)�� ������ Ŭ���� ���� ���ο� �ɺθ� ������ ����
		//Ŭ���� ���� ���� ����� �������� �ʿ��� ��ŭ�� �޸𸮸� �Ҵ� ����!
		
		//* new�� ���� �͵��� ���� �޸𸮸� ���� ���� �ǹ��� 
		// >> �Ҵ� ���� ���Ŀ��� scanner Ŭ���� ���� ��� ����� ����� �� ����
		
		System.out.print("ù ��° �� : ");
		
		double num1=Double.parseDouble(scan.nextLine()) ; //nextLine():�⺻ �ڷ����� ��Ʈ��(String)�̴�.
		//int num //4byte int�� �����ϸ� 4byte�� �ִ� ��!
		
//		System.out.println(num1);
		
		System.out.print("�� ��° �� : ");
		
		double num2=Double.parseDouble(scan.nextLine()) ; //nextLine():�⺻ �ڷ����� ��Ʈ��(String)�̴�.
		//int num //4byte int�� �����ϸ� 4byte�� �ִ� ��!
		
//		System.out.print(num2); // 1��° double �����ϱ� �������� �ι�° double�� ������� ����!
		
		//�ݵ�� ����ϰ� �־����!
		if (num2 != 0.0) { //���������� �� ������, ������ �� ���� 
			System.out.println("��� : " + (num1/num2));
		}else {
			System.out.println("0���� ���� �� �����ϴ�."); //������ ó�� �Ҷ��� ���� �� ���� ����� �� �׻� ������ֱ�!
		}
		
		
	}

}
