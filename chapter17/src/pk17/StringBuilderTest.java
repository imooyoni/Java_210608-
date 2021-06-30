package pk17;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String javastr = new String("Java");
		//처음 생성된 메모리 주소
		System.out.println("처음 생성된 메모리 주소 : " + System.identityHashCode(javastr));
		
		StringBuilder buffer = new StringBuilder(javastr); //StringBuilder 생성
		
		//buffer 라는 공간을 만들어서 연산작업함!
		//Buffer는 용량에 제한이 없이 동적으로 사용이 가능함!
		//메모리 주소가 같아서 참조할때 상수처럼 사용할 수 있음!
		
		//buffer의 메모리 주소
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("progamming is fun!!");
		
		//buffer 메모리 주소
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javastr = buffer.toString();
		System.out.println(buffer);
		System.out.println("연산 후 javastr 메모리 주소 : " + System.identityHashCode(javastr));
		
	}

}
