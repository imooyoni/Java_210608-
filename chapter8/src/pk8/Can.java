package pk8;

public class Can {
	Vending vending = new Vending();
	//������� = �ʵ�= �Ӽ�
	private String canName; //�����̸� >>getter setter�� ����ϱ� ���� ū�׸��� ���� ����
	private int price;//���ᰡ��
	
	//������
	public Can(String canName, int price) {//���ݰ� ���Ḧ �ƿ� ������ ����
		this.canName=canName; //this�� ������� ������ ���� ����� ������ ������
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
