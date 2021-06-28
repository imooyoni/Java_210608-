package pks15;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(21062801, "이동욱");
		Student studentLee2 = studentLee;
		Student studentKim = new Student(21062801, "이동욱");
		
		System.out.println("---동일한 주소의 두 인스턴스 비교---");
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		System.out.println();
		
		System.out.println("---다른 주소의 두 인스턴스 비교---");
		if(studentLee == studentKim)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if (studentLee.equals(studentKim))
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		System.out.println();
		System.out.println("---해쉬코드값 출력---");
		System.out.println("studentKim의 해쉬코드 : " + studentKim.hashCode());
		System.out.println("studentLee의 해쉬코드 : " + studentLee.hashCode());
		System.out.println("studentLee2의 해쉬코드 : " + studentLee2.hashCode());
		
	}

}
