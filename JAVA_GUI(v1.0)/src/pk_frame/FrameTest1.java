package pk_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("첫 프레임");//내가 만들 프레임의 제목
		frame.setBounds(700, 100, 400, 300); //(x좌표, y좌표, 너비, 높이)
		
		System.out.println(frame.getBounds().getWidth()); //가로를 가져와! (double)
		System.out.println(frame.getBounds().height); //세로를 가져와! (int)
		
		
		frame.setBackground(Color.BLUE); //배경색
		frame.setVisible(true); //false는 화면에 보이지 않음
	}

}
