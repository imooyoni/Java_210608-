package pk8;

public class DmbCellphoneExample {

	public static void main(String[] args) {

		DmbcellPhone dmbCellPhone = new DmbcellPhone("JavaPhone", "���", 11);
		//CellPhone
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		//DmbcellPhone
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		//CellPhone�� ���� ��ӹ��� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receVoice("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�� �ȳ�! ���� �� �ϼ���.");
		dmbCellPhone.receVoice("�Ⱦ��~~");
		dmbCellPhone.hangUp();
		System.out.println();
		
		//DmbcellPhone�� ���� �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.ChangeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
	}

}
