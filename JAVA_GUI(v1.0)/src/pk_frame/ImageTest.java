package pk_frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		
		f.setBounds(500, 100, 660, 450);
		
		//이미지
		ImageIcon img = new ImageIcon("에펠탑.jpg");
		JLabel jI = new JLabel(img);
		jI.setBounds(10, 30, 640, 427);
		
		f.add(jI);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
			
		});
		
		
	}
}
