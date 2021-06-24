package pk6;

import java.util.ArrayList;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		//ArrayList: 배열에 동적메모리를 지원(사용한 만큼 메모리 할당)
		ArrayList<Book> library = new ArrayList<Book>();//Book을 어레이 리스트함
		//임포트 해야함 <>컬랙션이라고 이야기함 안에 무엇을 담아도 됨
		
		//Object 자바에서 가장 큰 뭐시기 모든 타입에 대해 사용가능
		
		library.add(new Book("태백산맥","조경래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생텍쥐페리"));
		
		for(int i=0; i<library.size();i++) {//size 크기만큼
			Book book=library.get(i);//library[0] /index = 첨자
			book.showBookInfo(); //library[0].showBookInfo();와 같음
		}

		System.out.println();
		System.out.println("--향상된 for문 사용--");
		
		for (Book book : library) {//Book 타입에서 library를 불러와!
			book.showBookInfo(); 
			//>>해석 필요해... library가 어디있을까? 지금 여기에 저장한 내용인가?, book은 그냥 새로운 이름인가?
		}
		/*
		Book[] library=new Book[10];
				
		library[0]=new Book("태백산맥","조경래");
		library[1]=new Book("데미안","헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가","유시민");
		library[3]=new Book("토지","박경리");
		library[4]=new Book("어린왕자","생텍쥐페리");
		
		*/
	}

}
