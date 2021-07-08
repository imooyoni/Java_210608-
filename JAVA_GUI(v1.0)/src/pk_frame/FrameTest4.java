package pk_frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe fr = new Myframe();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("네번째 사용자 프레임");
		
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
			
		});
	}

}
