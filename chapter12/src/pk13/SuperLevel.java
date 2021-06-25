package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다");

	}

	@Override
	public void jump() {
		System.out.println("JUMP! JUMP!");

	}

	@Override
	public void turn() {
		System.out.println("빙글빙글~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********고수 입니다.**********");
	}

}
