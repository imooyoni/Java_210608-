package pk12;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//规过1
		driver.drive(new Taxi());
		//规过2
		Bus bus = new Bus();
		driver.drive(bus);
		
	}

}
