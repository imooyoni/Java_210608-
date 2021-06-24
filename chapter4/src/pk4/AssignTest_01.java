package pk4;

public class AssignTest_01 {

	public static void main(String[] args) {
		
		int aVar=20;
		System.out.println("aVar += 10 : " + (aVar += 10));
		//aVar 값은 변하지 않지만, 10을 더한 결과값을 구함
		//aVar = aVar + 10과 동일한 식
		System.out.println("aVar -= 10 : " + (aVar -= 10));//aVar = aVar - 10과 동일한 식
		System.out.println("aVar *= 10 : " + (aVar *= 10));//aVar = aVar * 10과 동일한 식
		System.out.println("aVar /= 10 : " + (aVar /= 10));//aVar = aVar / 10과 동일한 식
		System.out.println("aVar %= 10 : " + (aVar %= 10));//aVar = aVar % 10과 동일한 식
		
	}

}
