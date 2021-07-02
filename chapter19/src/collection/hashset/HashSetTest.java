package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("아몬드"));
		hashSet.add(new String("땅콩"));
		hashSet.add(new String("헤이즐럿"));
		hashSet.add(new String("브라질넛"));
		hashSet.add(new String("캐슈넛"));
		
		//Boolean b1 = hashSet.add(new String("땅콩")); //new String("땅콩")이 들어가 있는지 확인해죠!
		//System.out.println(b1);//들어가 있는데, 안 들어가있는데?
		System.out.println(hashSet);
		
		hashSet.add(new String("땅콩")); //중복되는 값은 입력되지 않음!
		//같은 엘리먼트(데이터)의 중복을 허용하지 않는다.
		//물리적주소(==) : pk hashSet@어쩌구저쩌구 /논리적(equals) : 있는 그대로의 값 
		hashSet.add(new String("마카다미아"));
		Boolean b1 = hashSet.add(new String("땅콩"));
		
		System.out.println(hashSet);
		System.out.println(b1);
		
	}

}
