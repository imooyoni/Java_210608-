package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		
		//�ζǹ�ȣ 6���� ���� �迭�غ�
		int[] lotto=new int[6]; //0 1 2 3 4 5
		System.out.print("�̹��� �ζ� �����ȣ : ");
		outer : for(int i=0; i<lotto.length;) {//i++ �������� >> ���� ĭ���� �񱳸� �� ���� �������迭�� �ƴϰ� outer���
			
			lotto[i]=new Random().nextInt(45)+1;
			
			//�ߺ����� ���ϴ� �ݺ���
			
			for (int j=0; j<i; j++) {//j�� 0���� �����ؼ� i���� ���� ������ ����
				if(lotto[i] == lotto[j]) { //lotto���� ������ i��° ���� j��°�� ���ؼ� �ߺ��Ȱ� �ִٸ� �ٽ� �������ΰ�
					continue outer;//������ ������ ���� outer�� ��
				}//if
			}//innerfor
			System.out.print(lotto[i] + " ");
			i++; //outer for��, ����° �ڸ��� ���� �ʴ� ������ �Ȱ��� ���ڰ� ���ͼ� 6��°�� �Ǹ� ���߰� �Ǿ ��� ���� �߰��ؼ� �ݺ�!
		}//outerfor
	}//main

}//class
