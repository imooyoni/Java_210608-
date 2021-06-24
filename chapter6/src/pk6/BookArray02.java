package pk6;

public class BookArray02 {
	public static void main(String[] args) {
		Book[] library=new Book[5];
		//library.getAuthor();
		
		library[0]=new Book("태백산맥","조경래");
		library[1]=new Book("데미안","헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가","유시민");
		library[3]=new Book("토지","박경리");
		library[4]=new Book("어린왕자","생텍쥐페리");
		
		// >> 완전 더러운 코드! 
		//System.out.println(library[i]); //같은 출력문을 5번 작성해야함!
		
		//System.out.println(library[0].bookName); >>비추천 출력문
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();//라이브러리 i번째를 불러와서 showBookInfo메소드를 실행해
		}
		
		System.out.println();
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
