package retest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDAO {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Employees> emparr = new ArrayList<>();
	
//////직원 등록//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void addEmployee() {
		Employees emp = new Employees();
		
		System.out.print("등록하실 직원의 이름을 입력하세요 ");
		String name = scan.next();
		System.out.print("등록하실 직원의 부서를 입력하세요 ");
		String part = scan.next();
		System.out.print("등록하실 직원의 주소를 입력하세요 ");
		String addr = scan.next();
		System.out.print("등록하실 직원의 번호를 입력하세요 ");
		String tel = scan.next();
		System.out.println("----------------------------------------------------------");
		
		emp.setName(name);
		emp.setPart(part);
		emp.setAddr(addr);
		emp.setTel(tel);
		
		emparr.add(emp);
	}
//////직원 조회//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void searchEmployee() {
		System.out.println("----------------------------------------------------------");
		System.out.println("조회 내용을 선택하세요");
		System.out.print("1. 전체 직원 조회");
		System.out.print(" || ");
		System.out.println("2. 특정 직원 조회");
		System.out.print("선택 >> ");
		int selectSearch = scan.nextInt(); 
		System.out.println("----------------------------------------------------------");
		
		if(selectSearch == 1) {
			if(emparr.size()==0) {
				System.out.println("등록된 직원 정보가 없습니다.");
				System.out.println("----------------------------------------------------------");
			}
			for(int i=0; i<emparr.size();i++) {
				System.out.println((i+1)+"번 직원 이름" +emparr.get(i).getName());
				System.out.println((i+1)+"번 직원 부서" +emparr.get(i).getPart());
				System.out.println((i+1)+"번 직원 주소" +emparr.get(i).getAddr());
				System.out.println((i+1)+"번 직원 번호" +emparr.get(i).getTel());
				System.out.println("----------------------------------------------------------");
			}
			
		} else if(selectSearch == 2) {
			System.out.print("조회할 직원 수를 입력하세요 >>");
			int empNum = scan.nextInt();
			
			if(empNum>emparr.size()) {
				System.out.println("등록하신 직원 수보다 많습니다.");
			}
			
			if(empNum<=emparr.size()) {
				for(int i=0; i<empNum; i++) {
					System.out.print((i+1)+"번째 조회할 직원의 이름을 입력하세요 >>");
					String searchName = scan.next();
					
					for(int j=0; j<emparr.size(); j++) {
						if(emparr.get(j).getName().equals(searchName)) {
							System.out.println("이름 : " + emparr.get(j).getName());
							System.out.println("부서 : " + emparr.get(j).getPart());
							System.out.println("주소 : " + emparr.get(j).getAddr());
							System.out.println("번호 : " + emparr.get(j).getTel());
							System.out.println("----------------------------------------------------------");
						}
					}
				}
			}
		} else {
			System.out.println("번호를 잘못 선택하셨습니다.");
		}
	}//search
	
//////직원 삭제//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void deleteEmployee() {
		
		System.out.print("삭제할 직원의 이름을 입력하세요 >>");
		String deleteName = scan.next();
		
		for(int i=0; i<emparr.size();i++) {
			if(emparr.get(i).getName().equals(deleteName)) {
				System.out.println(emparr.get(i).getName()+"직원 정보가 삭제되었습니다.");
				emparr.remove(i);
			}//if
		}//for
	}//delete

	
}//class
