package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {
		//전위 연산
		System.out.println("====전위 연산====");
		int gameScore=150;
		int lastScore1=++gameScore; //1을 더한 후 읽기 151
		System.out.println(lastScore1); //150
		
		int lastScore2=--gameScore; //1을 빼고 읽기 150
		System.out.println(lastScore2); //151
		
		//후위 연산
		System.out.println("====후위 연산====");
		int lastScore3=gameScore++; //읽고 난 후 (출력) 1을 더하기
		
		System.out.println(lastScore3); //150
		System.out.println(gameScore);//151
		System.out.println("--------");
		int lastScore4=gameScore--;
		
		System.out.println(lastScore4);
		System.out.println(gameScore);
		
	}

}
