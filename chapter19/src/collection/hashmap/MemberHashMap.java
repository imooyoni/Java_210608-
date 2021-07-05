package collection.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		// TODO Auto-generated constructor stub
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {//멤버에 해당하는 리스트만 등록함!
		hashMap.put(member.getMemberid(), member);
		//멤버아이디를 받아서 새로 입력한 아이디랑 가지고 있는 아이디랑 똑같냐?
		
	}
	
	public boolean removeMember(int memberid) { //멤버아이디를 매개변수로 받음
		
		if(hashMap.containsKey(memberid)) {
			hashMap.remove(memberid);
			return true;
		}
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}
		
	
	public void showAllMember() {

		Iterator<Integer> ir = hashMap.keySet().iterator(); //가방 털면 키만 골라서 털어야 함!
		
		while(ir.hasNext()) {
			int key = ir.next(); //key 저장
			Member member = hashMap.get(key); //key에 맞는 value 값을 불러옴!
			
			System.out.println(member);
		}//while
		
		System.out.println("총 엔트리 수 : " + hashMap.size());
		System.out.println();
	}
}
