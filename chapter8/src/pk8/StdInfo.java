package pk8;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;
	
	//������(�����ε�) studentName �� money�� ���� �¾
	public StdInfo() {
		
	}
	
	public StdInfo(String studentName, int money){
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {//����Ÿ���� � ������ ���⸸ �ϸ��!
		bus.take(1000);
		this.money-=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� �ܰ�� "+money+"�� �Դϴ�.");
	}
	
	
}
