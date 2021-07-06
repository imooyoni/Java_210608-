package pk21;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		//오류
		/*
		for(int i=0; i<=5; i++ ) {
			System.out.println(arr[i]);
		}
		*/
		
		try {
			for(int i=0; i<=5; i++ ) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("예외처리 부분");
		} finally { // 에러가 나던 안나던 무조건 수행
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}

}
