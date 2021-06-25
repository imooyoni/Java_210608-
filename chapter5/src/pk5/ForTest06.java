package pk5;

public class ForTest06 {

	public static void main(String[] args) {

		
		  int num=0;
		  int sum=0;
		  //합이 100을 초과하면 멈춤
		  
		  for(num=0; ; num++) { 
			  //if문과 혼합하여 쓰는 경우 조건 부분을 공백으로 남겨두어도 됨 
			 sum += num; 
			  if  (sum >= 100) 
				  break; 
			  }
		  
		  System.out.println("num : " + num + "입니다.");
		  System.out.println("sum : " +
		  sum + "입니다.");
		 
//=============================================================

		/* 합이 100보다 작을 때 까지 출력
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= 100; i++) {
		 * 
		 * sum += i;
		 * 
		 * if (sum < 100) {
		 * 
		 * System.out.println(sum);
		 * 
		 * } }
		 */
	}
}
