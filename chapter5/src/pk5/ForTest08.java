package pk5;

public class ForTest08 {

	public static void main(String[] args) {
		//이중 for문		
		int i, j;
		
		/*for (i=1; i<=5; i++) {
			for (j=1; j<=i; j++) {
				//i=1 j=1
				System.out.println(j + " ");
				}//안쪽 for문
			System.out.println("----");
		}//바깥쪽 for문*/
		
		for (i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
				System.out.println(j + " ");
			}
			System.out.println("----");
		}
	}//main
}//class
