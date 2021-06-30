package pk17;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		String str1=new String("abc");
		String str2=new String("abc"); //wrapper 클래스에서는 모두 toString 재정의가 되어 있느건가?
		
		System.out.println(str1 == str2);//물리적
		System.out.println(str1.equals(str2));//논리적
		
		
	}

}
