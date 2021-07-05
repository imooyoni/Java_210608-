package collection.treemap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		// TODO Auto-generated constructor stub
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {//멤버에 해당하는 리스트만 등록함!
		treeMap.put(member.getMemberid(), member);
		//멤버아이디를 받아서 새로 입력한 아이디랑 가지고 있는 아이디랑 똑같냐?
		
	}
	
	public boolean removeMember(int memberid) { //멤버아이디를 매개변수로 받음
		
		if(treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);
			return true;
		}
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}
		
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while (ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}	
}
