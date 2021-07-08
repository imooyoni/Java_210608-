package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest1_Br {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("동서남북");
		
		//버튼객체 배열로 준비
		Button[] arbtn = new Button[5];
		String[] btnTitles = {"닫기", "열기", "취소", "확인", "안녕"};
		
		for(int i=0; i<arbtn.length; i++) {
			arbtn[i] = new Button(btnTitles[i]);
		}
		
		//Frame도 BorderLayout과 같이 위치선정이 가능하다
		frame.add(arbtn[0], BorderLayout.EAST);
		frame.add(arbtn[1], BorderLayout.WEST);
		frame.add(arbtn[2], BorderLayout.SOUTH);
		frame.add(arbtn[3], BorderLayout.NORTH);
		frame.add(arbtn[4], BorderLayout.CENTER);
		
		//프레임에 내용물이 있을 때 그 내용물의 내용만큼만 영역을 확보
		frame.pack(); //화면에 뿌려!
		frame.setVisible(true); //화면에 뿌려!
		
		//동쪽에 위치한 닫기버튼 기능구현
		arbtn[0].addActionListener(new ActionListener() {//익명의 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {//기능을 넣는 것 > 이벤트 현상
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			
		});
		//윈도우창 x버튼 기능 구현
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
		});
	}

}
