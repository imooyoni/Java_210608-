package pk6;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int[][] arr=new int[2][3];
		
		int n=0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) { //arr[i].length = 3
				n++;
				System.out.print(n + "\t");
			}//for
			System.out.println();
		}//for
	}//main
}//class
