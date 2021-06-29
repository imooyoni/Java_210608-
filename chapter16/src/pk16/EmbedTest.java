package pk16;

import javax.swing.JOptionPane;

class Out{
	
	static int a=1; //객체 생성과 상관없이 사용가능(독립적)
	int b; //객체를 통해서 사용
	
	public static class In {
		
		String Infun() {
			return (a + "번째 Static 내부 클래스입니다.");
		}
		
	}
}

public class EmbedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		
		//원래대로 사용하는 방
		//Out obj1 = new Out(); (static 클래스이기 때문에 생략됨)
		//Out.In obj2 = obj1.new In();
		
		//static은 객체없이 클래스명으로 접근!
		Out.In obj1 = new Out.In();
		str = obj1.Infun();
		//System.out.println(obj1);
		
		
		JOptionPane.showConfirmDialog(null, str+"\n Success!");
		
		
	}

}
