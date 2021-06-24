package pk4;

public class Example03 {

	public static void main(String[] args) {

		//삼항 연산자를 이용하여 score가 90보다 크면 'A'이고 score가 80보다 크면 'B'
		int score;
		score=70;
		char result1, result2;
		
		result1 = (score > 90) ? 'A' : 'B';
		System.out.println("학점은 : " + result1);
		
		//삼항 연산자를 이용하여 score가 90보다 크면 'A'이고 score가 80보다 크면 'B'이고 그 이하는 모두 'C'로 간주한다.
		result2 = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		
		System.out.println("학점은 : " + result2);		
		
	}

}
