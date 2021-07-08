package pk_frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe fr = new Myframe();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("다섯번째 사용자 프레임");
		//방법1 - myevent (완전 권장)
		fr.addWindowListener(new MyeventListener() {
		});

		//방법2 - 구현부별 재정의(비추) - 임플리먼트 많고 코드 김
		//fr.addWindowListener(new WinClosingListener() {
		//});
		
		/*방법3 - 익명의 클래스(비추) - 코드 드러움
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
		});
		*/

	}

}
//상속, 임플리먼트된 클래스 명
//myeventlistener

//winclosinglistener
//listenerclass

//프로젝트 할때, myeventlistener와 같은 이벤트 창고를 별도로 두면 익명의 클래스를 안쓰고 한줄로 다 처리할 수 있음!