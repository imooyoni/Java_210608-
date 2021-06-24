package pk5;

public class IfExample06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;//1에서 시작해서 6까지 랜덤 숫자를 뽑아줌!
		
		//System.out.println(num);
		
		if (num==1) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
		if (num==2) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
		if (num==3) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
		if (num==4) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
		if (num==5) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
		if (num==6) {
			System.out.println("숫자 " + num + "이 나왔습니다.");
		}
	}

}
// 이중이프문은 변수값은 같은데, 조건이 다양하거나 결과값이 다양한 때 사용
// 엘스이프문은
