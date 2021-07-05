package collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//HashTable : 동기화 제공
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		String id;
		String pw;
		String login;
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요 > ");
			System.out.print("아이디 > ");
			id = scan.nextLine();
			System.out.print("비밀번호 > ");
			pw = scan.nextLine();
			
			if(map.containsKey(id)) {// containsKey = 너 이렇게 생긴  있어? 라고 뭍는 불린 메서드 
				//아이디가 없는 것
				if(map.get(id).equals(pw)) {
					//map.get(id) 아이디에 해당하는 값이 불러와짐
					System.out.println("로그인 되었습니다.");
					break;
				}//in if
				else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}//out if
			else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
			boolean flag = map.containsKey(id);
			if(flag) { //이미 아이디가 있음을 가정하고 들어오는 코
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호오");
				}
			}else {
				System.out.println("아이디 없");
			}
			/* try-catch
			try {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
				} else { System.out.println("비밀번호 오류");
			}catch (NullPointerExcaption e) {
				System.out.println("아이디 없음");
			}
			*/
		}//while

	}

}
