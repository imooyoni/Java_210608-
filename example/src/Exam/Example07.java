package Exam;

public class Example07 {

	public static void main(String[] args) {

		int max=0;
		
		int[] array = {1,2,3,4,5};
		
		//�ִ� �˰���
		for (int i=0; i<array.length; i++) {//��� �ٸ� �ͺ��� ������ �����!
			if(max<array[i])//max�� i��° array���� �۳�?
				max=array[i];//������ i���� array�� max��.
		}
			System.out.println(max);
		
	}

}

//array.size�� String �϶��� ����ϴ� �ǰ�?