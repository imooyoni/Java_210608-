package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo student1 = new StdInfo("James", 5000);
		StdInfo student2 = new StdInfo("Tomas", 10000);
		StdInfo student3 = new StdInfo("Sara", 7000);
		StdInfo student4 = new StdInfo("Amanda", 1000);
		
		Bus bs100 = new Bus(100);
		System.out.println(student1.studentName + "���� ž���� ������ "+ bs100.busNumber + "�� �Դϴ�.");
		
		System.out.print(bs100.busNumber);
		System.out.print(" �� ���� ����� ");
		System.out.println(bs100.money + "�� �Դϴ�.");
		student1.takeBus(bs100);
		student1.showInfo();
		bs100.busInfo();
		System.out.println();
		
		student3.takeBus(bs100);
		student3.showInfo();
		bs100.busInfo();
		System.out.println();
		
		Subway subwayGreen = new Subway("2ȣ��");
		System.out.println(student2.studentName + "���� ž���� ����ö��(��) "+ subwayGreen.lineNumber + " �Դϴ�.");
		student2.takeSubway(subwayGreen);//����ö ��������, �°�����
		student2.showInfo();			 //�л����� ��-
		subwayGreen.subInfo();			 //����ö���� ��+
		
		student4.takeSubway(subwayGreen);
		student4.showInfo();
		subwayGreen.subInfo();
	}
	
	

}
