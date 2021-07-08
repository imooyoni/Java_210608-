package pk_frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("버튼 테스트");
		f.setBounds(200, 200, 400, 400);
		
		f.setLayout(null);//자동배치 끔 >> 안끄면 다닥다닥 맘대로 나옴!
		//사용자정의로 위치와 크기 결정
		Button btnOk = new Button("확인");//확인버튼
		btnOk.setBounds(70, 90, 100, 50);

		Button btnClose = new Button("닫기");//닫기버튼
		btnClose.setBounds(btnOk.getBounds()); //ok버튼과 같은 위치! 겹치는 이유! 사이즈를 통일하기 위해서
		
		//겹치는 버튼 분리하기
		btnClose.setLocation(btnOk.getWidth() + btnOk.getX() + 60, btnOk.getY()); //(확인버튼 가로길이 + 60, y축 높이 맞추기)
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		
		
	}

}
