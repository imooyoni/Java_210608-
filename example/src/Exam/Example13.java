package Exam;

public class Example13 {

	public static void main(String[] args) {

		/*2���� �迭�� ����� �Ʒ��Ͱ��� ������ ä���ִ´�.

		int arr[][] = {{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}};

		2���� �迭 arr�� ��� ��� ���� �� �հ� ����� ���ϴ� ���α׷��� �ϼ��غ���.*/
		
		int arr[][] = {{1, 2, 3, 4, 5},
							  {6, 7, 8, 9, 10},
							  {11, 12, 13, 14, 15},
							  {16, 17, 18, 19, 20}};
		
		int total = 0;
		float average = 0;
		int count = 0;
			
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				total+=arr[i][j];
				count++;
			}//infor
			//���⿡ ����� ���ϸ� �ʱ�ȭ �ؾ���!  tcount/taverage/ttotal >> ���� ���, ���� ���ϱ�
		}//outfor
		
		average = (float)total / count;
		System.out.print("��� :" + average + " / ");
		System.out.println("���� : " +  total);
		
		
		
	}

}
