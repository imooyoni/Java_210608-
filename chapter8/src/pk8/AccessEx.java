package pk8;

public class AccessEx {
	private int aa;//����ȭ(���� Ŭ���������� ��밡��)
	public int bb; //����
	int cc; //��Ű���� ������ ��밡��
	
	public void SetA(int a) { //aa�� �����̺������� �޼���� �ۺ��̶� �޼��带 ���ؼ� ������ ���� ����
		aa=a;//private �̿��� public �޼��带 ���ؼ� �ܺο��� ��밡��
	}
	
	public void SetB(int b) {
		bb=b;	
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("\naa�� : " + aa + "\nbb�� : " + bb + "\ncc�� : " + cc);
	}//class off
	
	public static void main(String[] args) {
		AccessEx obj = new AccessEx();
		/*
		obj.aa = 10; ��������� �������ٰ���
		obj.bb = 20;
		obj.cc = 30;
		*/
		
		obj.SetA(10);//�޼���� ������ �ʱ�ȭ
		obj.SetB(20);
		obj.SetC(30);
		
		obj.Disp();
		
	}
}

