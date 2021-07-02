package collection.stack_queue;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len==0) {
			System.out.println("스택이 비어 있습니다.");
			return null;
		}
		return (arrayStack.remove(len-1));
	}
}

public class StackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack();
		
		myStack.push("오늘");
		myStack.push("정말");
		myStack.push("배고파요");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
	}

}
