package pk10;

public class StaticFunction {

	String str1="�Ϲ� �������";
	static String str2="Static �������";
	
	public static String getStatic() {
		
		//return str1;//Error: static ��� ������ static ������ ������ ����!(���� �� ����!) �޸� ����ϴ� ���� �ٸ��� ����
		return str2;
	}
}