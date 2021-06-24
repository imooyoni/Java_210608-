package pk8;

public class Vending {
	//멤버변수
	private Can can[]=new Can[5];//5개 배열의 캔 메모리를 할당
	private int money;
	
	//생성자 생략됨
	
	//초기화 메서드는 주로 init()로 씀
	public void init() {
		can[0]=new Can("환타", 1000);
		can[1]=new Can("콜라", 1200);
		can[2]=new Can("웰치스", 1100);
		can[3]=new Can("비타500", 900);
		can[4]=new Can("생수", 800);
	}
	
	public void showCans(int m) {
		money = m;
		
		//포문으로 가지고 있는 돈 구현
		//사용자의 돈으로 살수있는 음료만 보여주기
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName()+ " : " + can[i].getPrice()+"원");
			}//if
		}//for
		
	//선택한 음료 제공 후 잔액을 계산해서 주는 메서드
			
	}//showcans
	
	public void outCan(String name) {//내가 주는 이름과 getname과 같은지 비교
		
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {//string은 equauls를 사용할 수 있음, 외부에서 끌어오는 애를 먼저 놓는게 통상적
				System.out.println("선택하신 "+ name + "이 나왔습니다.");
				System.out.println("남은 현금은"+(money-can[i].getPrice())+"원 입니다.");
			}//if
		}//for
	}//outcan
	
}//vending
