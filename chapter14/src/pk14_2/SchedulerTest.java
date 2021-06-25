package pk14_2;

import java.util.Scanner;

public class SchedulerTest {

	//Scheduler클래스를 기준으로 하여 RoundRobin, LeasJob(대기시간이 짧은 상담원), PriorityAllocation
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String call;
		boolean run=true;
		
		Scanner scan = new Scanner(System.in);
				
		while(run) {
			
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");
			
			call = scan.nextLine();
			int ch = call.charAt(0);
			Scheduler sch1 = null;
			
			//System.in.read(); //: 콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch=System.in.read(); //아스키코드값
			
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
				System.out.println("상담이 종료되었습니다.");
				run=false;
				break;
			}
			else {
				System.out.println("지원되지 않는 기능입니다.");
				continue; //무시
			}
			sch1.getNextCall();
			sch1.sendCallToAgent();
			System.out.println("--------------------------------");
		}

	}

}
