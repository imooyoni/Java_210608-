package pk8;

public class DmbcellPhone extends CellPhone {
	
	//필드
	int channel;
	
	public DmbcellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
		
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void ChangeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	
}
