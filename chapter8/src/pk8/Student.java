package pk8;

public class Student {
	
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//������(�⺻������) : free complie
	
	//�޼���
	public void showStudent() {
		System.out.println(studentName + ", " + address);
		
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
