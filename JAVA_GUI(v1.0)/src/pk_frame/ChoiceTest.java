package pk_frame;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {//초이스박스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("설문조사");
		
		f.setSize(500,250); //전체 프레임의 크기
		f.setLocation(400, 100);
		
		f.setLayout(null); //자동배치 끄기
		
		Choice day = new Choice();
		
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		//자동배치를 꺼서 현재의 크기 반영되고, 높이는 요소 사이즈에 따라 결정되므로 의미없음
		day.setSize(150,0);//요소에 따라 알아서 크기를 결정해주므로 0을 넣음!
		day.setLocation(50, 100);
		
		//방법1 응용
		
		//day.addItemListener(new ChoiceHandler());
		
		
		//방법2
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println(day.getSelectedItem());
			}
		});
		
		
		f.add(day);
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
