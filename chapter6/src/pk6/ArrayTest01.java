package pk6;

public class ArrayTest01 {

	public static void main(String[] args) {

		/* �迭����
		int[] number1 = new int[10];
		int number2[] = new int[10];
		
		int number3[];
		number3[]=new int[10];
		*/
		
		/*�ݱ�ȭ >> ������ �޸𸮰� �Ҵ�Ǹ鼭 �����Ͱ� ����! ÷�ڰ� 0���� ������
		(���� �ȹ߻�)int[] number1 = new int[] {1,2,3,4,5,6,7,8,9,10}; //�迭�� {}���� �Է��ϰڴ�
		(���� �߻�)int[] number1 = new int[10] {1,2,3,4,5,6,7,8,9,10}; //�迭�� {}���� �Է��ϰڴ�
		int number3[] = {1,2,3,4,5,6,7,8,9,10};
		int[] number4 = {1,2,3,4,5,6,7,8,9,10};
		*/
	int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
	
	int len=number.length;
	
	for (int i=0; i<len ;i++) {
		System.out.println(number[i]);
	}
		
	}
}
