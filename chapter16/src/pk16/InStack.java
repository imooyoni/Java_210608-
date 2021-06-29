package pk16;

import java.util.EmptyStackException;

public class InStack {
	
	private int max; //스택 용량
	private int ptr; //스택 포인트
	private int[] stx; //스택 본체
	
	//실행 시 예외 처리 : 스택이 비어있음을 확인
	
	public class EmptyIntStackExcation extends RuntimeException {
		public EmptyIntStackExcation() {}
	}
	
	//실행 시 예외 처리 : 스택이 가득 참
	
	public class OverflowStackExcation extends RuntimeException {
		public OverflowStackExcation() {}
	}
	
	//생성자
	public InStack(int capacity) {
		// TODO Auto-generated constructor stub
		
		ptr = 0;
		max=capacity;
		try {
			stx = new int[max]; //max 만큼 배열줘 >> 스택 본체용 배열을 생 
		} catch (OutOfMemoryError e) {//암기하기! >>문제가 생겨서 생성할 수 없음 에러 발
			max=0; //에러가 발생하면 이렇게 처리
			// TODO: handle exception
		}
		
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowStackExcation{ //OverflowStackExcation로 찾아가서 생성자를 만들도록
		if(ptr >= max)
			throw new OverflowStackExcation();
		return stx[ptr++] = x;
	}
	
	//스택에서 데이터x를 뽑는다(pop) - 정상에 있는 데이터를 꺼
	public int pop(int x) throws EmptyStackException{
		if(ptr <= 0)
			throw new EmptyStackException();
		return stx[--ptr];
	}

	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다 봄 == 모니터링)
	public int peek() throws EmptyStackException{
		if(ptr <= 0)
			throw new EmptyStackException();
		return stx[ptr-1];
	} //>>연관검색어 노출 알고리즘
	
	//스택에서 x를 찾아 인텍스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr-1; i>=0; i--) //정상 쪽에서 바닥까지 긁어와 (선형검색)
			if(stx[i] == x)
				return i;//검색 성공
		return -1; //검색 실패
	}
	
	
}
