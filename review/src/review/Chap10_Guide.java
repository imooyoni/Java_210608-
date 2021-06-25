package review;

public class Chap10_Guide {

	/* 
 	스테틱 변수 목적지(point)를 가지는 Guide클래스를 만들고, 
	이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
	최초 실행시 등록할 관광객 수를 지정.
	지정한 수 만큼 Guest클래스의 배열로 만듬
	*/
	static String point;
	Chap10_Guest[] guest;
	
	public Chap10_Guide(int n) {
		
		point = "가거도";
		guest=new Chap10_Guest[n];
		
		for (int i=0; i<guest.length; i++ ) {
			guest[i] = new Chap10_Guest();
		}//for
	}//class
	
	public void showGuestInfo(int m) {
		System.out.println("--------------------");
			System.out.println((m+1) +". 이름 : "+guest[m].getName());
			System.out.println((m+1) +". 성별 : "+guest[m].getGender());
			System.out.println((m+1) +". 목적지 : "+point);
	}
	
}
