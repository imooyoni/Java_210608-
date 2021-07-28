package login;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.print("ID : ");
			String putId = scan.next();
			System.out.print("PW : ");
			String putPw = scan.next();
			
			//아이디가 회원정보(LoginDAO)에 등록되어 있는지 찾고
			LoginDAO.searchInfo(putId, putPw);
			//아이디에 저장된 비밀번호가 입력한 비밀번호와 일치하는지 비교
			//일치하면 로그인 성공 안내문
			//불일치하면 경고문
	}
}
