package pk6;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] array1= {10,20,30,40,50};
		int[] array2= {1,2,3,4,5};
		
//배열 복사 : system.arraycopy(array1,첨자(복사가 시작될 첨자), array2, 0(붙여넣기 시작 첨자), 0(붙여넣기 갯수/끝첨자);
		System.arraycopy(array2, 0, array1, 1, 4);
		
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
