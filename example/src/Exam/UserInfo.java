package Exam;

public class UserInfo {


		/* UserInfoŬ������ ���� ��, �ݾ��� ������ money��� ������ �����.
		deposit(int money)�޼��带 ����� ������ ���� �Ա����� ��츦 ó��.
		withdraw(int money)�޼��带 ����� ������ ���� ������� ��츦 ó��.
		�� �� �޼��忡�� ����ϰ��� �ϴ� �� ���� �ܾ��� ������� �ܾ��� �����ϴٴ� �޽����� ��µǵ��� �Ѵ�.
		showMoney()�޼��带 ����� ���� �ܾ��� ��ȯ�ϵ��� �Ѵ�.

		UserInfoŬ������ �������. 
		//
		MainŬ������ ���� ����� UserInfo�� ��ü�� ������ �� �Ʒ��� ����� �������� �غ���. 
		
		1.�� �� :
		2.�� �� :
		3. �ܾ�Ȯ�� : 
		4. �� �� :
		
		-- �� �� --
		�Ա��� �ݾ��� �Է� : 1000
		�Աݼ���
		
		---------------------
		-- �� �� --
		����� �ݾ��� �Է� : 1000
		��� �� �ܾ� : 
		��ݼ���
		�ܾ׺��� ��ݾ��� Ŭ ��� �ܾ׺���
		*/
		
		
		//�ʵ�
		private int money;//�ܾ�
		
		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		//�Ա�
		public void deposit(int money) {
			System.out.println(money + "���� �Ա��߽��ϴ�.");
			this.money+=money;
			
		}//deposit
		
		//���
		public void withdraw(int money) {//userinfo�� �ӴϿ��� ���� �Ӵϸ� ���� �� �����̸� �ܾ׺���
			if (this.money>=money) {
				System.out.println(money + "���� ����߽��ϴ�.");
				this.money-=money;
			}
			else if (this.money<money) {
				System.out.println("�ܾ��� �����մϴ�. ���� �ܾ� : " + this.money);
			}
		}//withdraw
		
		//���ϸ޼���
		public int showMoney() {
			return money;
		}
		

}//class
