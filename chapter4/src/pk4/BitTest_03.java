package pk4;

public class BitTest_03 {

	public static void main(String[] args) {
		
		int num = 0B00000101; //5
		System.out.println(num);
		
		//20�� �ǵ��� ����Ʈ�����ϱ�
		int result = num<<2;
		System.out.println(result);
		
		//1�� �ǵ��� ����Ʈ�����ϱ�
		result = num>>2;
		System.out.println(result);
		
		//num=num<<2;
		System.out.println(num);
	}

}
