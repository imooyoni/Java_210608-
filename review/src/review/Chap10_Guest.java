package review;

public class Chap10_Guest {

	/* 
 	����ƽ ���� point�� ������ GuideŬ������ �����, 
	�̸��� ���� ������ ���� Guest Ŭ������ ����� �Ʒ��� ����� �������� �ϴ� ������ ����
	���� ����� ����� ������ ���� ����.
	������ �� ��ŭ GuestŬ������ �迭�� ����
	*/
	private String name;
	private String gender;
	
	public String getPoint() {
		return Chap10_Guide.point;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
