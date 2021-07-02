package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberLim = new Member(1001, "임우연");
		Member memberKim = new Member(1002, "김소연");
		Member memberLee = new Member(1003, "이유진");
		Member memberOh = new Member(1004, "오세영");
		Member memberKang = new Member(1005, "강동원");
		//memberArrayList의 객체가 addmember 메서드를 실행하고 메서드의 매개변수가 memberLim
		
		memberHashSet.addMember(memberLim); //어레이리스트에 담아줄게
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberOh);
		memberHashSet.addMember(memberKang);
	
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(memberLee.getMemberid());
		
		memberHashSet.showAllMember();
		
		Member memberJung = new Member(1003, "정유미");
		memberHashSet.addMember(memberJung);
		memberHashSet.showAllMember();
	}

}
