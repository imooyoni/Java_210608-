package pk8;

public class StudentMain {

	public static void main(String[] args) {
		
		Student sa = new Student();
		System.out.println("-----�ʵ� �̿�-----");
		sa.studentName="��ö��";
		sa.address="��⵵ ����";
		System.out.println(sa.studentName+", "+sa.address);
		
		System.out.println("-----�޼ҵ� �̿�-----");
		sa.setStudentName("�����");
		sa.setAddress("����� ���α� 00���� 510ȣ");
		System.out.println(sa.getStudentName() + ", " + sa.getAddress());
		
	}

}
