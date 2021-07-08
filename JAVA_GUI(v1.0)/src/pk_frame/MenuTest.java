package pk_frame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("메뉴");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();//메뉴 공간확보
		Menu mFile = new Menu("File");//메뉴 구성
		
		//메뉴 기능구현
		
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		
		//하위메뉴 구성
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("프린트 셋업");
		MenuItem printPre = new MenuItem("프린트 미리보기");
		
		print.add(printSetup);
		print.add(printPre);
		
		MenuItem miClose = new MenuItem("Close");

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		mb.add(mFile); //메뉴바에 메뉴 붙이기
		f.setMenuBar(mb); //프레임에 메뉴바 붙이기
		f.setVisible(true);
		
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
		});
		
	}
}
