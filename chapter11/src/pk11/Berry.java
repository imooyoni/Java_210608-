package pk11;

import javax.swing.JOptionPane;

//���
public class Berry extends Fruit{ 
	//���ο��� Ǫ��� ���� ��� �Բ� ���� ���� ��, ������ ��ü�� �޾Ƽ� ����ϸ� ��� ����� ������
	
	private String size;
	private String name;
	
	public void Set2(String a, String b) {
		size = b;
		name=a;
		
	}

	public void Disp2() {
		System.out.println("�̸� : " + name);
		System.out.println("ũ�� : " + size);
	}	

}
