package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�");

	}

	@Override
	public void jump() {
		System.out.println("JUMP! JUMP!");

	}

	@Override
	public void turn() {
		System.out.println("���ۺ���~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********��� �Դϴ�.**********");
	}

}
