package pk13;

public abstract class Phone {

	public String owner;//�ʵ�
	
	//����Ʈ �����ڰ� ���� ���ְ� �������� ���� -> �߻������(���� ���� ������ �ʴ� ���!)�� ����
	
	public Phone(String owner) {//������
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
	
}
