package pk10;


/* 
 	스테틱 변수 point를 가지는 Guide클래스를 만들고, 
	이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
	최초 실행시 등록할 관광객 수를 지정.
	지정한 수 만큼 Guest클래스의 배열로 만듬
	
	결과 : 
	관광객 수 : 2 (사용자가 입력)
	관광객 등록
	1. 이름 : 홍길동
	1. 성별 : 남
	--------------------------
	2. 이름 : 홍길순
	2. 성별 : 여
	
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	
	선택 >> 1
	1. 이름 : 홍길동
	1. 성별 : 남
	1. 목적지 : 가거도
	--------------------------------------
	2. 이름 : 홍길순
	2. 성별 : 여
	2. 목적지 : 가거도
	========================================
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	
	선택 >> 2	
	어디로 변경하시겠습니까 : 오이도
	오이도로 목적지 변경
	========================================
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	선택 >> 3
	종료
 */
public class Guide {
	
	static String point;
	Guest[] guest;
	
	
	//생성자에서 초기화
	public Guide(int n) {
		point="가거도";
		// Guest의 배열 메모리 확보
		guest=new Guest[n]; 
		for(int i=0;i<guest.length;i++) {
			guest[i]=new Guest(); //Guest n개의 객체생성
				
		}
		
	
		
	}
	
	
}