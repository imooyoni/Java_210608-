package pk8;

public class Vending {
	//�������
	private Can can[]=new Can[5];//5�� �迭�� ĵ �޸𸮸� �Ҵ�
	private int money;
	
	//������ ������
	
	//�ʱ�ȭ �޼���� �ַ� init()�� ��
	public void init() {
		can[0]=new Can("ȯŸ", 1000);
		can[1]=new Can("�ݶ�", 1200);
		can[2]=new Can("��ġ��", 1100);
		can[3]=new Can("��Ÿ500", 900);
		can[4]=new Can("����", 800);
	}
	
	public void showCans(int m) {
		money = m;
		
		//�������� ������ �ִ� �� ����
		//������� ������ ����ִ� ���Ḹ �����ֱ�
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName()+ " : " + can[i].getPrice()+"��");
			}//if
		}//for
		
	//������ ���� ���� �� �ܾ��� ����ؼ� �ִ� �޼���
			
	}//showcans
	
	public void outCan(String name) {//���� �ִ� �̸��� getname�� ������ ��
		
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {//string�� equauls�� ����� �� ����, �ܺο��� ������� �ָ� ���� ���°� �����
				System.out.println("�����Ͻ� "+ name + "�� ���Խ��ϴ�.");
				System.out.println("���� ������"+(money-can[i].getPrice())+"�� �Դϴ�.");
			}//if
		}//for
	}//outcan
	
}//vending
