package pk6;

public class ArraySum03 {
	
	public static void main(String[] args) {
		//����(Ŭ���̾�Ʈ)�� ����ϰ� �ؾ���
		//int[] score = {83, 90, 97};
		
		int[] score;
		//score=new int[] {83, 90, 97};
		/*
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
	
		System.out.println("���� : " + sum);
		*/
		int sum2=add(new int[] {83,90,87});
		System.out.println("���� : " + sum2);
		System.out.println();
	}//main >> ���������� �������
		
	//�Ű����� : �޼ҵ�(�Լ�)�� ������(����)�ÿ� ���Ǵ� ���� ,ex_int[] score >> �Ű�����
	// ���ϱ⸦ �� �� �ƴ� ���� >> ���ο��� 
	public static int add(int[] score) {
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
	}
	return sum;
	}//main

}//class
