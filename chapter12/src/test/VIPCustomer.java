package test;

public class VIPCustomer extends Customer{
	
	protected int agentID;
	double saleRatio;
	
	//�������� agentID(����)
	//10���� ���� saleRatio 0.1
	//���ʽ� ����Ʈ
	
	//������ �̿�(���� ���̵�, �̸�, �����ѹ� ����) >> �������̵� �� �޼ҵ� super���
	//������ �̿�(��� = vip, bonusratio=0.05, saleratio,)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//
		super(customerID, customerName); //customername�̶� customerid�� ���� �����Ǿ�� �ؼ� ���۷� ����  
		this.agentID=agentID;//vip Ŭ���� �������� �����Ǹ� �Ǿ this�� ����
		
		setCustomerGrade("VIP");
		bonusRatio=0.05;
		saleRatio=0.1;
	}

	//calcPrice = > �������̵�
	//return �������ΰ� ���
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price)-(int)(price*saleRatio);
		//������ ��ȯ���� - ���ι��� �͸�ŭ ����
	}
	
	//1. ������ ��ӹ޾Ƽ� ����

	@Override
	public String showCustomerInfo() {
		//�θ�Ŭ������ �޼��带 ����ϰ� �������̵� �߰�
		return super.showCustomerInfo() + "\n��� ������ ID�� "+ agentID + "�Դϴ�.";
	}
	
	//���� ���̵� ���ϸ޼��� �߰�
	public int getAgentID() {
		return agentID;
	}
	
}
