package pk5;

public class SwitchCase07 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*4)+8; // double > int // +���� ���ڴ� ���� ���ڸ� �ǹ���!
		System.out.println("[����ð�: " + time + "��]"); // [����ð�: N��]
		
		switch (time) {
		
		case 9:
			System.out.println("����մϴ�.");
			break;
		case 10:
			System.out.println("Ŀ�Ǹ� ���ð� ���ϴ�.");
			break;
		case 11:
			System.out.println("������ �Խ��ϴ�.");
			break;
		
		default:
			System.out.println("ź�±ٹ��� �մϴ�.");
			break;
		}
		
	}
}
