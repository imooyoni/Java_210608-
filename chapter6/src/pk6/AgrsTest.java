package pk6;

public class AgrsTest {

	public static void main(String[] args) { //�޸� �̸��� ������
		//�ʱ�ȭ
		//int a[]=new int[5];
		//int []a
		//a=new int[5]
				
		int aVal;
		int bVal;
		int Tot;
		
		/*
		args = new String[2]; //�޸� �Ҵ�
		args[0]="1";
		args[1]="2";
		*/
		
		if(args.length == 3) {
			
			//String -> int
			
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[1]);
			
		}//true end
		else {
			aVal=0;
			bVal=0;
			
		}//false end
		
		Tot = aVal + bVal;
		System.out.println(Tot);
	}//main
}//class
