package pk9;

public class KoreaExample {

	public static void main(String[] args) {
		Korea ca = new Korea("James", "Canada");
		Person ps1 = new Person("James", 34);
		System.out.println(ps1.age+"�� " + ps1.name + "��(��) " + ca.nation + "��� �Դϴ�.");
		System.out.println();
		
		Korea ko = new Korea("��ö��", "Korea");
		Person ps2 = new Person("��ö��", 58);
		System.out.println(ps2.age+"�� " + ps2.name + "��(��) " + ko.nation + "��� �Դϴ�.");
		System.out.println();
		
		Korea cn = new Korea();
		Person ps3 =new Person();
		cn.name="Ī����";
		cn.nation="China";
		ps3.name="Ī����";
		ps3.age=7;
		System.out.println(ps3.age+"�� " + ps3.name + "��(��) " + cn.nation + "��� �Դϴ�.");
		System.out.println();
		
	}

}
