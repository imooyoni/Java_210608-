package pk5;

public class ForTest05 {
	
	public static void main(String[] args) {
		
		//1부터 100까지의 합을 구하되 합이 100에 가장 가까운 수
		int sum = 0;
		int num;
		
		for (num=0 ; sum<100; num++) {
			System.out.print(sum + " ");
			sum+=num;
			}
		
		System.out.println();
		System.out.println("num : " + num + "입니다.");
		System.out.println("sum : " + sum + "입니다.");
	}

}

/*
 * for(int i=1;i<=100;i++) { sum+=i; if(sum<100) { System.out.println(sum);}
 */
