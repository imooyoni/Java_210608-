package pk14_2;

public class LeasJob implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에게 받아옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담업무가 없거나 상담대기 시간이 가장 작은 상담원에게 배분합니다.");
	}
	

}
