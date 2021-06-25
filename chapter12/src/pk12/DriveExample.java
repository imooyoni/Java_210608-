package pk12;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//방법1
		driver.drive(new Taxi());
		//방법2
		Bus bus = new Bus();
		driver.drive(bus);
		
	}

}
