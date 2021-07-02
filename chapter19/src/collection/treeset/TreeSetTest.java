package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("강동원");
		treeSet.add("원빈");
		treeSet.add("유승호");
		
		for (String str : treeSet) { //string에 comparable 때문에 됨
			System.out.println(str);
		}
		
		
		
	}

}
