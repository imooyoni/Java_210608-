package pk13;

public class Player {

	//Player Level level = new PlayerLevel(); 
	private PlayerLevel level; // level�� PlayerLevel Ÿ�Կ� ���� ������
	
	
	public Player() {
		//PlayerLevel level = new BeginnerLevel();
		level = new BeginnerLevel(); //�ʺ��ڷ� �޸� ����
		level.showLevelMessage(); //�ʺ��� �޼���
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {//������ �о���
		this.level = level;
		level.showLevelMessage(); //�� ������ �޼���
	}
	
	public void play(int count) {
		level.go(count);
	}
}
