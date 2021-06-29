package pk16;

import javax.swing.JOptionPane;

class Out2 {
	//멤버변수(=인스턴스 변수) 
	int b=10;
	static int a=1; //데이터 영역에 위치함! 스태틱은 스태틱끼리 사용이 가능함! 그 이유는 힙이나 스택메모리는 사라지기 때문에 스테이틱이 참조할때 값이 없을 수 있다!
	String str=""; //힙메모리 사용 > 객체가 있어야지만 사용함!
	
	//생성자 
	//메서드 안에 있는 지역변수들은 스택메모리를 사용함
	public class In{//스태이틱 클래스 안에 스태이틱이 아닌 멤벼변수가 있을 경우! 쓸 수 있
		String Infun() {
		/*b=20; >> b가 스태이틱 변수가 아니기 때문에 클래스가 static이더라도 사용할 수 없음!
		System.out.println(b);*/
		return(a + "번째 Non-Static 내부 클래스");
		}
	}
	
}


public class NonStaticTest {

	public static void main(String[] args) {//static은 stactic에서만!
		
		String str = "";
		// TODO Auto-generated method stub
		//외부클래스 객체생성
		Out2 obj1 = new Out2(); //생성자를 통해서 만들어 줌
		
		//내부클래스 객체생성
		Out2.In obj2 = obj1.new In(); //out class를 거쳐서 들어와야 함!
		obj1.new In();
		
	str = obj2.Infun();
	
	JOptionPane.showConfirmDialog(null, str+"\n Success");

	}

}
