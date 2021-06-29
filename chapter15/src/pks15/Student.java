package pks15;
//해쉬코드 재정의 
public class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) { //int, String 필드!
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentName + "학생의 학번은 "+ studentId + "입니다.";
	}//toString

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}

	@Override
	public boolean equals(Object obj) { //equals(Student std)
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student) obj;//다운캐스팅
			//DataBase에 있는 값(studentId)과 현재 로그인을 위해 입력한 값(std.studentId)이 같은지 비교
			if(studentId == std.studentId) 
				return true;
			else return false;
		}//if
			
		return super.equals(obj);
	}
	
	
	
}//Student

