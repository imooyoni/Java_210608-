package Exam;

public class Example08 {

	public static void main(String[] args) {

		int[][]array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		
		int count=0;
		int tcount=0;
				
		//outer
		for (int i=0; i<array.length; i++) { //�� 3�� �ݺ�, 0/1/2
			//inner
			for(int j=0; j<array[i].length; j++) { //��2,3,5
					sum+=array[i][j]; // sum�� array[i][j]�� ����
					count++;
			}//inner
			
			avg=(double)sum/count;
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
			
			total += sum;//�� �� sum �� ����, �ʱ�ȭ ���� ����
			tcount += count;// �ʱ�ȭ ���� ����
			
			sum=0;//sum, avg ������ outer�� ���ư� >> �����Ⱚ ����
			avg=0.0;
			count=0;
			
			System.out.println("--------------------");
		}//outer
		
		System.out.println("--���� ���հ� ���--");
		double avgf=(double)total/tcount;
		
		System.out.println("sum : " + total);
		System.out.println("avg : " + avgf);
	}
	//main
}//class
