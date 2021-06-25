package pk13;

public class Player {

	//Player Level level = new PlayerLevel(); 
	private PlayerLevel level; // level은 PlayerLevel 타입에 대한 변수방
	
	
	public Player() {
		//PlayerLevel level = new BeginnerLevel();
		level = new BeginnerLevel(); //초보자로 메모리 받음
		level.showLevelMessage(); //초보자 메세지
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {//레벨을 읽어줌
		this.level = level;
		level.showLevelMessage(); //각 레벨의 메세지
	}
	
	public void play(int count) {
		level.go(count);
	}
}
