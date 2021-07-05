package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberTreeMap memberHashMap = new MemberTreeMap(); 
		
		Member memberLim = new Member(1001, "임우연");
		Member memberLee = new Member(1003, "이유진");
		Member memberKang = new Member(1005, "강동원");
		Member memberKim = new Member(1002, "김소연");
		Member memberOh = new Member(1004, "오세영");
		
		//순서가 엉망진창으로 입력했더라도 정렬이 되어서 나
		
		memberHashMap.addMember(memberLim); 
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberOh);
		memberHashMap.addMember(memberKang);
	
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
