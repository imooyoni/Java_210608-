package pk5;

public class ForTest05 {
	
	public static void main(String[] args) {
		
		//1���� 100������ ���� ���ϵ� ���� 100�� ���� ����� ��
		int sum = 0;
		int num;
		
		for (num=0 ; sum<100; num++) {
			System.out.print(sum + " ");
			sum+=num;
			}
		
		System.out.println();
		System.out.println("num : " + num + "�Դϴ�.");
		System.out.println("sum : " + sum + "�Դϴ�.");
	}

}

/*
 * for(int i=1;i<=100;i++) { sum+=i; if(sum<100) { System.out.println(sum);}
 */
