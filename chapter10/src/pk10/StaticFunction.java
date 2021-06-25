package pk10;

public class StaticFunction {

	String str1="일반 멤버변수";
	static String str2="Static 멤버변수";
	
	public static String getStatic() {
		
		//return str1;//Error: static 재부 에서는 static 변수만 접근이 가능!(받을 수 있음!) 메모리 사용하는 것이 다르기 때문
		return str2;
	}
}