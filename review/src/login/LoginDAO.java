package login;

import java.util.Hashtable;
import java.util.Map;

import javax.swing.JOptionPane;

public class LoginDAO {
	private static Map<String, String> loginInfo;
	
	public LoginDAO() {
		//login 초기화
		if (loginInfo == null) {
			init();
			System.out.println("e");
		}
	}
	
	private void init() {
		loginInfo = new Hashtable<String, String>();
		
		//회원1
		loginInfo.put("sara", "sara123");
		//회원2
		loginInfo.put("jaye", "jaye123");
		
	}
	
	public static Boolean searchInfo(String id, String pw) {
		try {
			while(true) {
				if(loginInfo.containsKey(id)) {
					System.out.println("가입 ID : " + id);
					if(loginInfo.get(id).equals(pw)) {
						JOptionPane.showMessageDialog(null, "로그인 되었습니다.", "로그인 성공", 5);
						return false;
					}
					else {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "로그인 실패", 1);
					}
				} else {
					System.out.println("아이디 없음");
					JOptionPane.showMessageDialog(null, "입력하신 아이디가 존재하지 않습니다.",	"로그인 실패", 1);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
