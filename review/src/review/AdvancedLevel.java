package review;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���� �޷�");
	}

	@Override
	public void jump() {
		System.out.println("JUMP!");
	}

	@Override
	public void turn() {
		System.out.println("ȸ���� ����...");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("�߱����Դϴ�.");
	}

	
	
	
}
