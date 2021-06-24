package review;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달려");
	}

	@Override
	public void jump() {
		System.out.println("JUMP!");
	}

	@Override
	public void turn() {
		System.out.println("회전은 아직...");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자입니다.");
	}

	
	
	
}
