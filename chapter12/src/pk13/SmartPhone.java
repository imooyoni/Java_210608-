package pk13;

public class SmartPhone extends Phone{

	//������
	public SmartPhone(String owner) {//������ �ȿ� ������ ȣ��
		//����� ���� ���! �θ�Ŭ������ �����ڸ� �ݵ�� ����ؾ� ��!
		super(owner); //super(owner) = Phone(owner)
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�");
	}
	
}
