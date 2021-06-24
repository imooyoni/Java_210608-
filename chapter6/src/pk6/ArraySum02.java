package pk6;

public class ArraySum02 {

	public static void main(String[] args) {

		int[] score = {83, 90, 97};
		
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg=(double)sum/score.length;
		System.out.println(String.format("Æò±Õ : %.2f", avg));
	}

}
