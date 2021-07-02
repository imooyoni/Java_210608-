package collection.stack_queue;

import java.util.Stack;



public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//push pop peek
		
		//synchronized = 동기화
		//멀티스레드의 경우 규칙이 없으면 동시에 같은 자료가 수정될 수 있다!
		//이럴때 동기화(vector)를 하면 쓰는 동안 락이 걸림! >> commit은 완료라는 뜻!
		
		Object obj; //컴파일 안해도 
		//empty 스택 생성 비어있는지 물어볼거야
		
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) { //비어있으면 추가해줄게!
			for(int i = 0; i<=3; i++) {
				st.push(new String("Hi"+(i+1)));
				System.out.println("입력 : " + (i+1)+"번째"+st.peek());
			}
		}
		st.pop();
		System.out.println("현재 TOP의 위치 : " + st.peek());
		st.pop();
		System.out.println("현재 TOP의 위치 : " + st.peek());
		
		st.push(new String("everybody"));
		System.out.println(st.peek());
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());
		
	}

}
