package pks15;


class Book{
		
		int bookNumber;
		String bookTitle;
		
		public Book(int bookNumber, String bookTitle) { //초기화 해봐!∨
			
			this.bookNumber=bookNumber;
			this.bookTitle=bookTitle;
	}
		//재정의
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return bookTitle+", " +bookNumber;
		}
		
}

public class ToStringEx1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book(200, "강아지"); //힙메모리에 200, 강아지를 줬지만불러오려면 재정의를 해줘야 함!
		
		System.out.println(bk);//객체의 주소값 반환
		System.out.println(bk.toString());//heap메모리데이터 문자열처리
		
		String str=new String("TEST");//String은 자동으로 toString처리가 되어 있음!
		System.out.println(str);
	}

}
