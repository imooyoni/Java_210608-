package pk8;

public class StudentMain {

	public static void main(String[] args) {
		
		Student sa = new Student();
		System.out.println("-----필드 이용-----");
		sa.studentName="김철수";
		sa.address="경기도 고양시";
		System.out.println(sa.studentName+", "+sa.address);
		
		System.out.println("-----메소드 이용-----");
		sa.setStudentName("김수진");
		sa.setAddress("서울시 종로구 00빌딩 510호");
		System.out.println(sa.getStudentName() + ", " + sa.getAddress());
		
	}

}
