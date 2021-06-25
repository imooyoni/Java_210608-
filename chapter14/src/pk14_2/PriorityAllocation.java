package pk14_2;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에게 받아옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 skill 값이 높은 상담원에게 배당됩니다.");
	}
	

}
