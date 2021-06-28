package pk14;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {//add(), remove(), sort(), size() 모두 사용 가능
		shelf = new ArrayList<String>(); //생성자를 통해서 초기화 함(set역할)
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
