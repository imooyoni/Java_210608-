package collection.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj;
		
		//크기를 1로 선언
		Vector<Object> vec = new Vector<Object>(1); 
		//가방안에는 6개가 있는데, 1개 꺼내서 쓰고 넣고 다른거 꺼내서 쓰고 넣어놓고 해서 1만 줘도 가능!
		obj = 20210702;
		vec.addElement(obj);//엘리먼트 추가
		
		//vector의 용량과 수
		System.out.println("용량은 #1 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #1 : " + vec.size());
		System.out.println();
		
		obj = "some people";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량은 #2 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #2 : " + vec.size());
		System.out.println();
		
		obj = "dream of success";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량은 #3 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #3 : " + vec.size());
		System.out.println();
		
		obj = "some people";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량은 #4 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #4 : " + vec.size());
		System.out.println();
		
		obj = "other people";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량은 #5 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #5 : " + vec.size());
		System.out.println();
		
		obj = "get up";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량은 #6 : " + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 #6 : " + vec.size());
		System.out.println();
		
		System.out.println(vec);
	}

}
