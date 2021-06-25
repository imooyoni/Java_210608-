package pk6;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//배열크기 3개짜리 Book클래스의 인스턴스 변수 선언
		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3];
	
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("어떻게 살 것인가","유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //복사만 하는 것
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //show 어래이 메소드를 이용해서 출력하는 것
		}
		//원본이 바뀌는 복사, 원본이 바뀌지 않는 복사 등 종류가 많다.
	}

}
