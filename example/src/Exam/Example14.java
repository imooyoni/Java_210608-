package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example14 {
	/*String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW", "APPLE"};
	WordScramble Ŭ������ ����� ���Ͱ��� �迭�� �����ϰ�, �̸� �̿��Ͽ�
	WordScrambleMainŬ�������� �������� �� �Ʒ��� ����� ��µǰ� �� ����.

	������ : 
	���� :PEALP
	�ܾ��? : ealpp
	ealpp����...
	�ܾ��? : apple
	apple����!!!!*/
	
	String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW", "APPLE"};
	String shake = "";
	
	//���� ��ȯ �޼���
	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];//�������� ���� ���� �ܾ�!
	}//getAnswer
	
	//�ܾ ��� ��ȯ�ϴ� �޼���
	public String getScrambleWord(String str) {
		
		//����ܾ ���� ������ ��� ����
		//int�迭 ����
		int[] inArr = new int[str.length()]; //str �ܾ��� char ���� inArr
		
		//������� inArr�迭�� �� �濡 ��ġ�� �ʵ��� ó���� ������ �Է�
		
		for(int i=0; i<inArr.length;) {//�޸� Ȯ��
			inArr[i] = new Random().nextInt(str.length()); //��� ��!
			//i=0�� �������� ���� char�� ��!
			
			//�ߺ������� �Ǵ��ϴ� ���� ����!
			boolean check = false; 
			//�ߺ��� ����(��������) �˰���(�����Ҷ� �ַ� ���)
			for(int j=0; j<i;j++) {
				if (inArr[i] == inArr[j]) {//�������� ���� �ܾ�� ���ϴ� �ܾ�� ����?
					check = true; //������
					break;//����!
				}//if
			}//in for
			
			//�ߺ��� ���� ������ i�� ������Ŵ!
			if(!check) {//�ߺ��� ������ check=false
				i++;
			}//if2
		}//out for
			//�ߺ������� �Ǵ��ϴ� ���� ��!
		
		for(int i=0; i<str.length();i++) {
			//str�� ���� ������ ������ �־���
			//���� �ڵ忡�� �߻���Ų ������ ������� ��� ������ �߰���
			shake+=str.charAt(inArr[1]);
		}
		return shake;
	}
	
}//class	
	

