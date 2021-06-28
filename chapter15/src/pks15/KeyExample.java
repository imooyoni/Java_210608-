package pks15;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashmap = new HashMap<>();
		
		hashmap.put(new Key(1),	"홍길동"); //첫번째 힙메모리(1만 입력하면 홍길동이 튀어 나오는 식별키)
		
		String value=hashmap.get(new Key(1));
		System.out.println(value);
	}

}
