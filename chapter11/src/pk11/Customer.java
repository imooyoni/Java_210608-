package pk11;

public class Customer {

	//(����Ʈ, ����, ���� �Ŵ���) �Ϲݰ� < VIP
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected double bonusPoint;
	protected double bonusRatio; // ������
	protected int price;
	
	//������ ID, ���� ����ϱ�
	//������ �� Vip�� �ƴϸ�
	public Customer() {//���̵�� ���� ���� �α���
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	//�������̵� //ȸ������ �� �α���
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	//�޼��� ����Ʈ����
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return price; //���� ���� ����ϰ� �ٽ� �״�� �����ٰ�
	}
	
	public String showCustomerInfo() {
		return customerName+"���� ����� "+customerGrade+" �̸�,\n���ʽ�����Ʈ�� "+bonusPoint+"�� �Դϴ�.";
	}
	
	//10%����, 5% ����, ��������
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
