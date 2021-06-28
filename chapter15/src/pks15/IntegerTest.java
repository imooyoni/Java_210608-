package pks15;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer i = new Integer(100);//취소선 :  사용을 권장하지 않음을 의미
		
		Integer num=100;
		int iNum=num.intValue();//Integer클래스에서 정수값만 가져오겠다(과거에 사용하던 방식)
		int jNum=200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		//UnBoxing
		int total = num+jNum; //num.intValue()으로 변환됨
		System.out.println(total);
		
		//Boxing == AutoBoxing
		Integer i =jNum;
		System.out.println(i); // Integer.valueOf()을 사용해서 기본자료형으로 변환해 줌
		
	}

}
