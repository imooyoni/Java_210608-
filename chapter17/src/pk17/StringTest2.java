package pk17;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		String androidStr = new String(" android");
		System.out.println(javaStr); //toString
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		System.out.println("--------------------");
		System.out.println(javaStr);
		//heap메모리이기 때문에 javaStr에 두개 더한거를 대입해도  heap주소가 다름 >> 이 현상 원하지 않으면 clone 사용함! clone하면 주소도 복사!
		System.out.println(System.identityHashCode(javaStr));
	}

}
