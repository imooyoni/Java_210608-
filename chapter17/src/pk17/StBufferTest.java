package pk17;

public class StBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = ""; //방을 비워둠
		StringBuffer buf = new StringBuffer(" Nice Day!!!");
		
		//문자열 처리
		System.out.println(buf.toString());
		//문자열 크기
		System.out.println(buf.length());
		//문자열의 용량 (기본 16에다가 문자열 크기 추가)
		System.out.println(buf.capacity());
		//문자열 용량 증가(현재의 용량보다 큰 수로 매개변수 사용시 2배+2)
		buf.ensureCapacity(28);
		System.out.println(buf.capacity());
		buf.ensureCapacity(50);
		System.out.println(buf.capacity());

		
		//문자열에 새로운 문자열의 일부내용제거
		buf.insert(0,"HI!");
		buf.insert(13," Everybody!");
		
		System.out.println(buf);
		
		//StringVuffer 문자열의 일부내용 제거
		buf.delete(0, 4); //0번재 부터 시작해서 4글자 지우기
		System.out.println(buf);
	}

}
