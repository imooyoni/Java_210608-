package frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class pj_frame {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("버스예매시스템");
		f.setBounds(700, 200, 700, 700);
		
		f.setLayout(null);
		
		ImageIcon img = new ImageIcon("스쿨버스.png");
		JLabel jL = new JLabel(img);
		jL.setBounds(50, 30, 550, 340);
		
		Button btnOk = new Button("확인");//확인버튼
		btnOk.setBounds(620, 430, 100, 50);

		Button btnClose = new Button("닫기");//닫기버튼
		btnClose.setBounds(btnOk.getBounds());
		
		btnClose.setLocation(btnOk.getWidth() + btnOk.getX() + 60, btnOk.getY());
		
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
