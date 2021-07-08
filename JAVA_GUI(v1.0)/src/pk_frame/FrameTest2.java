package pk_frame;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프레임 설정
		JFrame frame = new JFrame("두번째");
		//Jframe 창 크기 설정
		frame.setSize(400, 400);
		frame.setLocation(800, 100);
		
		//x버튼으로 프레임 닫기
		//프레임이 닫힐때 메모리를 반납! >> 이 기능은 Jframe에서만 사용가능
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//여러개의 프레임 중 원하는 프레임만 종료하고자 할때, dispose()
		//열려있는 프레임의 수와 상관없이 강제로 JVM을 종료하려면 system.exit() 사용!
		//frame.dispose(); >> 이창만 닫을 거야!
		
	}

}
