package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {
		//���� ����
		System.out.println("====���� ����====");
		int gameScore=150;
		int lastScore1=++gameScore; //1�� ���� �� �б� 151
		System.out.println(lastScore1); //150
		
		int lastScore2=--gameScore; //1�� ���� �б� 150
		System.out.println(lastScore2); //151
		
		//���� ����
		System.out.println("====���� ����====");
		int lastScore3=gameScore++; //�а� �� �� (���) 1�� ���ϱ�
		
		System.out.println(lastScore3); //150
		System.out.println(gameScore);//151
		System.out.println("--------");
		int lastScore4=gameScore--;
		
		System.out.println(lastScore4);
		System.out.println(gameScore);
		
	}

}
