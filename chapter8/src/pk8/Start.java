package pk8;

import java.util.Random;
import java.util.Scanner;

public class Start {

	private int random= new Random().nextInt(50)+1;
	private int count;
	private String result = "FAIL";
	
	public String check(int n) {

		count++; //�� �޼��带 �ѹ� ���� ������ count�� �ö�
		
		if(n<random) {
			System.out.println("UP!");
		}
		else if(n>random) {
			System.out.println("DOWN!");
		}
		else if(n==random) {
			System.out.println(count + "ȸ ���� �¾ҳ׿� :)");
			result = "SUCCESS"; //������ ���������� ������� �ٲ���
		}	
		return result;//String �ڷ����̹Ƿ� ���ϰ��� ��ȯ�ؾ� �ϴµ�, �¾��� ���� SUCCESS Ʋ���� ���� FAIL�� ��ȯ��
	}//check
}//class

