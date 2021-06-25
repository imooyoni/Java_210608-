package pk14;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		Remote rmtv = new SmartTelevision();
		rmtv.turnOn();
		rmtv.setVolume(200);
		SmartTelevision smtv = new SmartTelevision();
		smtv.search("À¯Æ©ºê");
		rmtv.setVolume(-10);
		rmtv.turnOff();
		
	}

}
