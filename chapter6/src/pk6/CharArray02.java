package pk6;

public class CharArray02 {
	
	public static void main(String[] args) {
		
		char [] alphabets = new char[26];
		
		char ch='A'; //ASCII 65
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i]=ch;
			System.out.println(alphabets[i]);
		}
		/*
		for (int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]);
		}
		*/
		
		/*
		System.out.println(ch++);
		System.out.println(ch);
		*/
		
	}

}
