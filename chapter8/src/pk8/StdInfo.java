package pk8;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo() {
		
	}
	
	//생성자(오버로딩) studentName 과 money는 갖고 태어남
	public StdInfo(String studentName, int money){
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {//버스타입의 어떤 변수가 들어가기만 하면됨!
		bus.take(1000);
		this.money-=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 잔고는 "+money+"원 입니다.");
	}
	
	
}
