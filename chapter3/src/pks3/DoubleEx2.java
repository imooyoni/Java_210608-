package pks3;

public class DoubleEx2 {

	public static void main(String[] args) {

		double dnum=1;
		
		/* ctrl+shift+"/" : ���� �ּ�ó��, ctrl+shift+"\": ������ �ּ�����, ctrl+"/": ���� �ּ�ó��
		 * dnum=dnum + 0.1; 
		 * System.out.println(dnum);
		 */
		

		for(int i=0; i<=10000; i++) { //for�� �ݺ��� : ������ �����ؼ� 
			dnum=dnum + 0.1;
		}
		
		System.out.println(dnum);
	}

}
