package pk6;

public class ArrayTest01 {

	public static void main(String[] args) {

		/* 배열선언
		int[] number1 = new int[10];
		int number2[] = new int[10];
		
		int number3[];
		number3[]=new int[10];
		*/
		
		/*쵸기화 >> 데이터 메모리가 할당되면서 데이터가 들어간당! 첨자가 0부터 시작함
		(오류 안발생)int[] number1 = new int[] {1,2,3,4,5,6,7,8,9,10}; //배열에 {}값을 입력하겠다
		(오류 발생)int[] number1 = new int[10] {1,2,3,4,5,6,7,8,9,10}; //배열에 {}값을 입력하겠다
		int number3[] = {1,2,3,4,5,6,7,8,9,10};
		int[] number4 = {1,2,3,4,5,6,7,8,9,10};
		*/
	int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
	
	int len=number.length;
	
	for (int i=0; i<len ;i++) {
		System.out.println(number[i]);
	}
		
	}
}
