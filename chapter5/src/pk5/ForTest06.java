package pk5;

public class ForTest06 {

	public static void main(String[] args) {

		
		  int num=0;
		  int sum=0;
		  //���� 100�� �ʰ��ϸ� ����
		  
		  for(num=0; ; num++) { 
			  //if���� ȥ���Ͽ� ���� ��� ���� �κ��� �������� ���ܵξ �� 
			 sum += num; 
			  if  (sum >= 100) 
				  break; 
			  }
		  
		  System.out.println("num : " + num + "�Դϴ�.");
		  System.out.println("sum : " +
		  sum + "�Դϴ�.");
		 
//=============================================================

		/* ���� 100���� ���� �� ���� ���
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= 100; i++) {
		 * 
		 * sum += i;
		 * 
		 * if (sum < 100) {
		 * 
		 * System.out.println(sum);
		 * 
		 * } }
		 */
	}
}
