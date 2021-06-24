package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo student1 = new StdInfo("James", 5000);
		StdInfo student2 = new StdInfo("Tomas", 10000);
		StdInfo student3 = new StdInfo("Sara", 7000);
		StdInfo student4 = new StdInfo("Amanda", 1000);
		
		Bus bs100 = new Bus(100);
		System.out.println(student1.studentName + "님이 탑승한 버스는 "+ bs100.busNumber + "번 입니다.");
		
		System.out.print(bs100.busNumber);
		System.out.print(" 번 버스 요금은 ");
		System.out.println(bs100.money + "원 입니다.");
		student1.takeBus(bs100);
		student1.showInfo();
		bs100.busInfo();
		System.out.println();
		
		student3.takeBus(bs100);
		student3.showInfo();
		bs100.busInfo();
		System.out.println();
		
		Subway subwayGreen = new Subway("2호선");
		System.out.println(student2.studentName + "님이 탑승한 지하철은(는) "+ subwayGreen.lineNumber + " 입니다.");
		student2.takeSubway(subwayGreen);//지하철 수입증가, 승객증가
		student2.showInfo();			 //학생정보 돈-
		subwayGreen.subInfo();			 //지하철정보 돈+
		
		student4.takeSubway(subwayGreen);
		student4.showInfo();
		subwayGreen.subInfo();
	}
	
	

}
