package pk8;

public class StudentInfo {
	
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	void Name(String n) {
		studentName = n;
	}
	void ID(int i) {
		studentID = i;
	}
	
}
