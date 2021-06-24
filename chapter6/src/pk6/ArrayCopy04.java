package pk6;

//깊은 복사 >> 원본에만 영향을 주고 복사본은 영향을 받지 않음!
public class ArrayCopy04 {

	public static void main(String[] args) {

		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3];
	
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("어떻게 살 것인가","유시민");
		
		bookArray2[0]=new Book(); //객체를 직접 생성
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());//1에 있던 것을 가져와서(get) 2에도 설정(set)해줌
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());			
		}
		
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("--원 본--");
		
		bookArray1[0].setBookName("나 목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); 
		}
		
		System.out.println("--복사본--"); // 원본이 변경된 내용을 복사본에도 적용시키고 싶다면 복사본 출력하기 전에 set/get 한번 더 반복해주어야 함.
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 
		}
	}

}
