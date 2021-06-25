package pk13;

public class MainBoard {

	public static void main(String[] args) {

		boolean run=true;
		int lv;
		
		System.out.println("게임을 시작합니다.");
		System.out.println("");
		/*
		while(run) {
			
			
			switch (lv) {
			case1:
				Player player = new Player();
				player.play(1);
				break;
				
			case2:
				AdvancedLevel aLevel = new AdvancedLevel();
				aLevel.showLevelMessage();
				aLevel.go(1);
				break;
				
			case3:
				SuperLevel sLevel = new SuperLevel();
				sLevel.showLevelMessage();
				sLevel.go(1);
				break;
					
					
			}
			
			run=false;
		}
		*/
		
		//기본 게임 레벨 1단계
		Player player = new Player();
		player.play(1);
								
		//레벨 2단계
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);//중급자 레벨로 세팅
		player.play(2); //=aLevel.go
		
		/*
		aLevel.showLevelMessage();
		aLevel.go(1);
		*/		
				
		//레벨 3단계
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		/*
		sLevel.showLevelMessage();
		sLevel.go(1);
		*/
	}

}
