package review;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("달려");
	}

	@Override
	public void jump() {
		System.out.println("JUMP는 아직 못 쓰는 기능이지요.");
	}

	@Override
	public void turn() {
		System.out.println("JUMP는 아직 못 쓰는 기능이지요.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("비기너입니다.");

	}

}
