package pk9;

public class ThisTest {
	
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	//기본생성자
	
	public ThisTest() {
		this(10,3,"Bab","20210608");
	}
	
	public ThisTest(int Speed, int Age, String RobotName, String RobotNum) {
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	public void Move() {
		Speed += 20;
		System.out.println("RobotSpeed : " + Speed);
	}
	
	public void Stop() {
		Speed = 0;
		System.out.println("RobotSpeed : " + Speed);
	}
	
	public void RAge() {
		Age +=1;
		System.out.println("RobotAge : " + Age);
	}
	
	public void RName() {
		System.out.println("RobotName : " + RobotName);
	}
	public void RNum() {
		System.out.println("RobotNumber : " + RobotNum);
	}
}
