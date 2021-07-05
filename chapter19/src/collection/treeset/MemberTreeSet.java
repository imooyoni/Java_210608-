package collection.treeset;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;//선언
	
	public MemberTreeSet() {
		// TODO Auto-generated constructor stub
		treeSet = new TreeSet<Member>(new Member());//메모리확보
	}
	
	public void addMember(Member member) {//멤버에 해당하는 리스트만 등록함!
		treeSet.add(member);
		//멤버아이디를 받아서 새로 입력한 아이디랑 가지고 있는 아이디랑 똑같냐?
		
	}
	
	public boolean removeMember(int memberid) { //멤버아이디를 매개변수로 받음
		/*
		for (int i=0; i<hashSet.size(); i++) {
			Member member = hashSet.get(i);
			int tempId = member.getMemberid();
			
			if(tempId == memberid) {
				hashSet.remove(i);
				return true;
			}//if
			
		}//for
		*/
		
		Iterator<Member> i = treeSet.iterator();
		
		while(i.hasNext()) {
			Member member = i.next();
			
			int tempId = member.getMemberid();
			if(tempId == memberid) {
				treeSet.remove(member); //객체를 날리는 단서가 memberid이라는 의미
				return true;
			}//if
		}
		
		System.out.println("일치하는 ID가 존재하지 않습니다.");
		
		return false;
	}
	
	public void showAllMember() {
		
		for (Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
