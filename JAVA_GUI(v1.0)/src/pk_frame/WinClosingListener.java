package pk_frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WinClosingListener extends ListenerClass {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "종료되지 않을걸?");
	}

}
