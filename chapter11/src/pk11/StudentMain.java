package pk11;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student("김영철", "sol20120621", 0001);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
