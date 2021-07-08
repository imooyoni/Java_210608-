package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MyBorderLayout {

	Frame f = new Frame();
	Button jb1 = new Button("북");
	Button jb2 = new Button("서");
	Button jb3 = new Button("중앙");
	Button jb4 = new Button("동");
	Button jb5 = new Button("남");
	Button jb6 = new Button("버튼6");
	
	public MyBorderLayout() {
		//버튼 추가시 어디에 배치할 것인지를 명시해야한다.
		f.setLayout(new BorderLayout());
		f.add(jb1, BorderLayout.NORTH);
		f.add(jb2, BorderLayout.WEST);
		f.add(jb4, BorderLayout.EAST);
		f.add(jb5, BorderLayout.SOUTH);
		
		f.add(jb6, "Center");
		f.setSize(400,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyBorderLayout();
		
	}

}
