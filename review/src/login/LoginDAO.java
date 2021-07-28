package login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class LoginDAO {
	public static Map<String, String> loginInfo;
	public static Set<String> keySet;
	
	public LoginDAO() {
		//login 초기화
		if (loginInfo == null) {
			init();
		}
	}
	
	private void init() {
		loginInfo = new HashMap<String, String>();
		
		//회원1
		loginInfo.put("sara", "sara123");
		//회원2
		loginInfo.put("jaye", "jaye123");
		//회원3
		loginInfo.put("daniel", "daniel123");
		
	}
	
	public static Boolean searchInfo(String id, String pw) {
		try {
			if(loginInfo.containsKey(id)) {
				System.out.println("가입 ID : " + id);
				if(loginInfo.get(id).equals(pw)) {
					JOptionPane.showMessageDialog(null, "로그인 되었습니다.", "로그인 성공", 5);
					return true;
				}
				else {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다.", "로그인 실패", 1);
					return false;
				}
			} else {
				System.out.println("아이디 없음");
				JOptionPane.showMessageDialog(null, "가입되지 않은 아이디입니다.",	"로그인 실패", 1);
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return null;
			
	}
}
