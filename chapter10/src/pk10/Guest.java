package pk10;

public class Guest {
	
	//�ʵ� : �̸��� ���� private
	private String name;
	private String gender;
	
	//������ ����
	
	public String getPoint() {
		//������ ��ü �����Ͽ� �����ؾ������� static�̹Ƿ� Ŭ���������� ���� ����
		return Guide.point;
	}

	//getter and setter
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
