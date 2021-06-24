package pk12;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		//sa.flyMode=2;
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		//sa.flyMode=1;
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
