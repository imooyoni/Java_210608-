package pk10;

public class StaticFunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �Ϲ����� ���(��ü����=>heap)
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);*/
		
		//Static�޼���� Ŭ������.�޼���� ������ �����ϴ�
		String str;
		str=StaticFunction.getStatic();
		
		System.out.println("str = " +str);
		 
		
		
		
	}

}
