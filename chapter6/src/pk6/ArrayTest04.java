package pk6;

public class ArrayTest04 {

	public static void main(String[] args) {

		double[] data = new double[5];
		
		int size = 0;
		
		data[0] = 10.0;
		size++;
		data[1] = 20.0;
		size++;
		data[2] = 30.0;
		size++;
		
		//����� ��ŭ�� ���� ����!
		
		for(int i = 0; i<size; i++) {
			System.out.print(data[i] + " ");
		}
	}

}