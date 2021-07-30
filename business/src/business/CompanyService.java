package business;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<CompanyBasics> csarr = new ArrayList<CompanyBasics>();
	
	public void addInfo() {
		CompanyBasics cb = new CompanyBasics();
		
		System.out.print("등록할 직원의 이름을 입력하세요 : ");
		cb.setName(scan.next());
		System.out.print("등록할 직원의 부서를 입력하세요 : ");
		cb.setPart(scan.next());
		System.out.print("등록할 직원의 주소를 입력하세요 : ");
		cb.setAddr(scan.next());
		System.out.print("등록할 직원의 생일을 입력하세요 : ");
		cb.setBirthday(scan.next());
		
		csarr.add(cb);
		System.out.println("사원 정보가 등록되었습니다.");
	}
	
	public void searchInfo() {
		System.out.print("검색하고자 하는 사원의 이름은?");
		String searchName = scan.next();
		int count=0;
		
		if(csarr.size()==0) {
			System.out.println("등록된 직원이 없습니다.");
		}

		for(int i=0; i<csarr.size(); i++) {
			if(csarr.get(i).getName().equals(searchName)){
				System.out.println("이름 : "+csarr.get(i).getName());
				System.out.println("부서 : "+csarr.get(i).getPart());
				System.out.println("주소 : "+csarr.get(i).getAddr());
				System.out.println("생일 : "+csarr.get(i).getBirthday());
				
				count++;
			}
		}
		if(count==0) {
			System.out.println("검색하신 직원이 없습니다.");
		}
	}
}
