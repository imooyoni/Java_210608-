package collection;

import java.util.Comparator;

//Comparable : Override => compareTo
//Comparator : Override => compare (이미 정렬되어 있는 데이터 재정렬)
public class Member implements Comparable<Member>, Comparator<Member>{
	
	private int memberid;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 "+ memberid + "입니다.";
	}
	//물리적인 주소 JDKdptj 주는 주소를 사용하지 않음
	//개발자가 임의로 정해서 heap 메모리 주소를 지정
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberid;//너의 객체주소는 맴버아이디와 같아!
	}
	
	//논리적인 주소(엘리먼트)
	@Override
	public boolean equals(Object obj) {
		//비교하면서 들어오기때문에 입력한 순서대로 출력된 것!
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberid==member.memberid)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		//return (this.memberid - member.memberid)*-1;//>내림차순
		return (this.memberid - member.memberid)*1;//>오름차순
	}
	//재정의 할때 사용! > 내림차순*(-1) 할때 많이 씀!
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberid - member2.memberid)*(-1); //>내림차순
	}
	

}
