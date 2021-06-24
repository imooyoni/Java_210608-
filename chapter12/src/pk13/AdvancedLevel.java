package pk13;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("조금 빠를걸요?");

	}

	@Override
	public void jump() {
		System.out.println("JUMP!");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn은 무서워요~");
		// TODO Auto-generated method stub

	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********중급자 입니다.**********");
	}

}
