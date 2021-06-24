package pk9;

public class KoreaExample {

	public static void main(String[] args) {
		Korea ca = new Korea("James", "Canada");
		Person ps1 = new Person("James", 34);
		System.out.println(ps1.age+"세 " + ps1.name + "은(는) " + ca.nation + "사람 입니다.");
		System.out.println();
		
		Korea ko = new Korea("김철수", "Korea");
		Person ps2 = new Person("김철수", 58);
		System.out.println(ps2.age+"세 " + ps2.name + "은(는) " + ko.nation + "사람 입니다.");
		System.out.println();
		
		Korea cn = new Korea();
		Person ps3 =new Person();
		cn.name="칭따오";
		cn.nation="China";
		ps3.name="칭따오";
		ps3.age=7;
		System.out.println(ps3.age+"세 " + ps3.name + "은(는) " + cn.nation + "사람 입니다.");
		System.out.println();
		
	}

}
