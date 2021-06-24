package pk11;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student("±èº¹³²", "sol20120621", 0001);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
