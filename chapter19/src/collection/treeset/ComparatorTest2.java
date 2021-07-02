package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Comparator : 정렬을 재정의 할 때
class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) { //내림차순으로 바꿀거야!
		// TODO Auto-generated method stub
		
		
		return (o1.compareTo(o2))*-1; //*-1 : 내림차순, 안하면 오름차
	}
	
}


public class ComparatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>(new MyCompare());
		//역순으로 정렬하려면 생성자 매개변수에 comparator의 기본생성자 넣기!
		
		set.add("수박");
		set.add("체리");
		set.add("딸기");
		
		System.out.println(set);
	}

}
