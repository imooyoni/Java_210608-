package pk13;

public class MainBoard {

	public static void main(String[] args) {

		boolean run=true;
		int lv;
		
		System.out.println("������ �����մϴ�.");
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
		
		//�⺻ ���� ���� 1�ܰ�
		Player player = new Player();
		player.play(1);
								
		//���� 2�ܰ�
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);//�߱��� ������ ����
		player.play(2); //=aLevel.go
		
		/*
		aLevel.showLevelMessage();
		aLevel.go(1);
		*/		
				
		//���� 3�ܰ�
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		/*
		sLevel.showLevelMessage();
		sLevel.go(1);
		*/
	}

}
