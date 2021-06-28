package pks15;

public class ArrayCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 arr배열 출력");
		
		for (int arr:arr2) {
			System.out.print(arr + " ");
		}
		//System.out.println("\n");
		
		/*for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}*/
		
		System.out.println();
		System.out.println("복사된 arr1배열 출력");
		arr2[3] = 0;
		
		for(int arr:arr1) {
			System.out.print(arr+ " ");
		}
		System.out.println();
		System.out.println("복사된 arr2배열 출력");
		for(int arr:arr2) {
			System.out.print
			(arr+" ");
		}
		
	}

}
