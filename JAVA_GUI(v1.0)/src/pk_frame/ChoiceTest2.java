package pk_frame;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest2 {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setSize(500,250); //전체 프레임의 크기
		f.setLocation(400, 100);
		
		f.setLayout(null); //자동배치 끄기
		
		Choice area = new Choice();
		area.add("지역선택");
		area.add("서울");
		area.add("경기");
		area.add("제주");
		area.add("포항");
		area.add("일본");
		
		area.setSize(150, 0);
		area.setLocation(50, 100);
		
		area.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println(area.getSelectedItem());
			}
		});
		
		f.add(area);
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
