package pks3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a=65; // �빮�� A
		int a=97; // �ҹ��� a
		System.out.println(a); //������ ����ȯ, ����� ����ȯ �� ����
		System.out.println((char)a); //���ڸ� ��� ���ڷ� �ٲ㼭 �Ͻø� ���ݾƿ� > ����ȯ(ASCII�ڵ�)
		
		System.out.println("===========================");
		//int�� char�� ȣȯ�� ���������� ������ ȣȯ���� �ʴ´�
		int b=-66;
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("===========================");
		char a2=65;
		//char b2=-66; // Error ASCII�ڵ忡 ��õǾ� ���� ���� ���̱� ������ ����!
		System.out.println(a2);
		System.err.println((int)a2);
		
		System.out.println("===========================");
		
		
		
	}

}
