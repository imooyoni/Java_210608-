package pk6;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		//Ȯ������
		
		String[] strArray= {"Java", "Python","Android","C","JavaScript"};
		/*
		for (int i=0; i<strArray.length; i++)
			System.out.println(strArray[i]);
		*/
		
		//[Ljava.lang.String;@2f92e0f4 (�ؽ��ڵ�)�޸� �ּ�:16������ ǥ���
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		
		for(String lang/*�ƹ����Գ� �ᵵ��! �� �̸�*/ : strArray) { //strArray����Ʈ�� ��°�� ������ ��!
			System.out.println(lang);//��°�� �Ѱܹ��� ���ñ⸦ �ϳ��� �Ѱ���
		}//for
	}//main
}//class


//���ڽ������� ÷�ڰ� ��°�� �����