package pk7;

public class FunTest07 {
	//void�� �ƴϸ� ���ϰ��� �־�� ��!
	public static int Recur(int a) { //3*2*1
		
		int gop;
		System.out.println(a); //3 2 1
		
		if(a==1)
			return (1); //return 1 = break >> 1 �Ѱ��ذ� �ƴ�! : ������������ ������ ���� �Ѱ����� ����
			
		else {
			gop = a*Recur(a-1); //3 * 2 = 6 | 2 * 1 = 2
		}
		
		return (gop);
		
		//return 0; //���� ����
	}
	
	public static void main(String[] args) {
		int res, x=5;
		
		System.out.println("����� main() �Դϴ�");
		 System.out.println("�޼ҵ带 ȣ���մϴ�.");
		
		res = Recur(x); //����Լ��� �����Ͻÿ�
		
		System.out.println("main()���� �ٽ� ���ƿԽ��ϴ�.");
		System.out.println(" 1 ~ 3 ������ ���� ���� �� : " + res +"\n");
		
		
	}

}
