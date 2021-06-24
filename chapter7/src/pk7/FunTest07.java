package pk7;

public class FunTest07 {
	//void가 아니면 리턴값이 있어야 함!
	public static int Recur(int a) { //3*2*1
		
		int gop;
		System.out.println(a); //3 2 1
		
		if(a==1)
			return (1); //return 1 = break >> 1 넘겨준거 아님! : 정상종료지만 실제로 값을 넘겨주진 않음
			
		else {
			gop = a*Recur(a-1); //3 * 2 = 6 | 2 * 1 = 2
		}
		
		return (gop);
		
		//return 0; //정상 리턴
	}
	
	public static void main(String[] args) {
		int res, x=5;
		
		System.out.println("여기는 main() 입니다");
		 System.out.println("메소드를 호출합니다.");
		
		res = Recur(x); //재귀함수로 구현하시오
		
		System.out.println("main()으로 다시 돌아왔습니다.");
		System.out.println(" 1 ~ 3 까지의 수를 곱한 값 : " + res +"\n");
		
		
	}

}
