package review;

public class Chap10_Guest {

	/* 
 	스테틱 변수 point를 가지는 Guide클래스를 만들고, 
	이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
	최초 실행시 등록할 관광객 수를 지정.
	지정한 수 만큼 Guest클래스의 배열로 만듬
	*/
	private String name;
	private String gender;
	
	public String getPoint() {
		return Chap10_Guide.point;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
