package pk6;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] array1= {10,20,30,40,50};
		int[] array2= {1,2,3,4,5};
		
//�迭 ���� : system.arraycopy(array1,÷��(���簡 ���۵� ÷��), array2, 0(�ٿ��ֱ� ���� ÷��), 0(�ٿ��ֱ� ����/��÷��);
		System.arraycopy(array2, 0, array1, 1, 4);
		
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
