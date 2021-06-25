package pk14_2;

import java.util.Scanner;

public class SchedulerTest {

	//SchedulerŬ������ �������� �Ͽ� RoundRobin, LeasJob(���ð��� ª�� ����), PriorityAllocation
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String call;
		boolean run=true;
		
		Scanner scan = new Scanner(System.in);
				
		while(run) {
			
			System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
			System.out.println("L or l : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P or p : ���� skill ���� ���� �������� �Ҵ�");
			System.out.println("S or s : ����");
			System.out.print("��ȭ ��� �Ҵ� ����� �����ϼ��� : ");
			
			call = scan.nextLine();
			int ch = call.charAt(0);
			Scheduler sch1 = null;
			
			//System.in.read(); //: �ֿܼ� �Է¹ޱ� ��� �Է°��� �ƽ�Ű�ڵ尪
			//int ch=System.in.read(); //�ƽ�Ű�ڵ尪
			
			if (ch == 82 | ch ==114) {
				sch1 = new RoundRobin();
				System.out.println();
				
				}
			else if (ch == 76 | ch == 108) {
				sch1 = new LeasJob();
				System.out.println();
				
			}
			else if (ch == 80 | ch == 112) {
				sch1 = new PriorityAllocation();
				System.out.println();
				
			}
			else if (ch == 83 | ch== 115) {
				System.out.println("����� ����Ǿ����ϴ�.");
				run=false;
				break;
			}
			else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
				continue; //����
			}
			sch1.getNextCall();
			sch1.sendCallToAgent();
			System.out.println("--------------------------------");
		}

	}

}
