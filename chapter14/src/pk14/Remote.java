package pk14;

public interface Remote {
	
	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUM=0;
	
	//추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	

}
