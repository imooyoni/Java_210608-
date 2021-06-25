package pk14;

public class SmartTelevision implements Searchable, Remote{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV가 꺼졌습니다.");
	}

	@Override
	public void setVolume(int volume) {
		
		if(Remote.MAX_VOLUME-volume<0)
			this.volume=Remote.MAX_VOLUME;
		else if(volume<Remote.MIN_VOLUM)
			this.volume=Remote.MIN_VOLUM;
		else this.volume=volume;
		
		System.out.println("현재 TV볼륨: " + this.volume + "입니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
