package review;

public class Chap10_Guide {

	/* 
 	����ƽ ���� ������(point)�� ������ GuideŬ������ �����, 
	�̸��� ���� ������ ���� Guest Ŭ������ ����� �Ʒ��� ����� �������� �ϴ� ������ ����
	���� ����� ����� ������ ���� ����.
	������ �� ��ŭ GuestŬ������ �迭�� ����
	*/
	static String point;
	Chap10_Guest[] guest;
	
	public Chap10_Guide(int n) {
		
		point = "���ŵ�";
		guest=new Chap10_Guest[n];
		
		for (int i=0; i<guest.length; i++ ) {
			guest[i] = new Chap10_Guest();
		}//for
	}//class
	
	public void showGuestInfo(int m) {
		System.out.println("--------------------");
			System.out.println((m+1) +". �̸� : "+guest[m].getName());
			System.out.println((m+1) +". ���� : "+guest[m].getGender());
			System.out.println((m+1) +". ������ : "+point);
	}
	
}
