package test;

import java.awt.Choice;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestChoice2 extends JFrame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프레임 만들었어!
		JFrame e = new JFrame();
		e.setSize(400,400);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setVisible(true);
		
		//구역 나눴어!
		JPanel top = new JPanel();
		top.setBackground(Color.BLACK);
		top.setSize(400,200);
		top.setLocation(0,0);
		e.add(top);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.WHITE);
		bottom.setSize(400,200);
		bottom.setLocation(0, 200);
		e.add(bottom);
		
		//어레이리스트에 두개만 담을게!
		ArrayList<String> db = new ArrayList<String>();
		db.add("N10234567");
		db.add("G12034567");
		
		//초이스에 어레이리스트를 담으려고 했는데 방법을 모르겠어 코드까지 뽑았었는데.. 그거 없어졌어...
		Choice choice = new Choice();

		//////////////////////////////////////////////////////////////////////////
		db.forEach(
				item -> choice.add(item));
		
		// 초기 선택 값(자리) 지정
		// choice.select(1)  
		// 초이스 갯수
		// choice.getItemcount()
		// 초이스가 가지고 있는 아이템 보기
		// choice.getItem(1)
		//System.out.println(choice.getItemCount());
		//System.out.println(choice.getItem(0));
		//System.out.println(choice.getItem(1));
		
		// 이벤트 붙이는 방법 1
		choice.addItemListener(new ChoiceEventHandler(bottom));
		
		// 이벤 붙이는 방법 2 (내부 이벤트 리스너 사용)
		/*
		 * choice.addItemListener(new ItemListener() { public void
		 * itemStateChanged(ItemEvent e) { Choice choice = (Choice)e.getSource(); // 선택된
		 * 초이스의 인덱스(순서)를 반환 // choice.getSelectedIndex() // 선택된 초이스의 값을 반 //
		 * choice.getSelectedItem() System.out.println("choice Index : " +
		 * choice.getSelectedIndex()); System.out.println("choice Item : " +
		 * choice.getSelectedItem());
		 * 
		 * if (choice.getSelectedItem().equals("N10234567")) {
		 * System.out.println("1번 클릭!"); JLabel j1 = new JLabel("유동근 화이팅!");
		 * j1.setSize(400,200); j1.setLocation(15, 20); bottom.add(j1); } else if
		 * (choice.getSelectedItem().equals("G12034567")) {
		 * System.out.println("2번 클릭!"); JLabel j1 = new JLabel("유동근 화이팅!!!");
		 * j1.setSize(400,200); j1.setLocation(15, 20); bottom.add(j1); } } });
		 */
		//////////////////////////////////////////////////////////////////////////
		
		choice.setBounds(25,25, 300, 50);
		top.add(choice);
		
		//초이스에서 선택한 값이랑 이거랑 같으면 라벨을 bottom에 붙여주라
		/*if(choice.getSelectedItem().equals("N10234567")) {
			JLabel j1 = new JLabel("유동근 화이팅!");
			j1.setSize(400,200);
			j1.setLocation(15, 20);
			bottom.add(j1);
		} else if(choice.getSelectedItem().equals("G12034567")) {
			JLabel j1 = new JLabel("유동근 화이팅!!!");
			j1.setSize(400,200);
			j1.setLocation(15, 20);
			bottom.add(j1);
		}*/
		
		
	}

}

/////////////////////////////////////////////////////////////
// 이벤트 붙이기 방법 1에 사용 되는 이벤트 리스너 클래
class ChoiceEventHandler implements ItemListener{
	JPanel _bottomH;
	ChoiceEventHandler(JPanel bottomH) {this._bottomH = bottomH;}
	 
	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice choice = (Choice)e.getSource();
		// 선택된 초이스의 인덱스(순서)를 반환
		// choice.getSelectedIndex()
		// 선택된 초이스의 값을 반
		// choice.getSelectedItem()
		System.out.println("choice Index : " + choice.getSelectedIndex());
		System.out.println("choice Item : " + choice.getSelectedItem());
		
		if (choice.getSelectedItem().equals("N10234567")) {
			_bottomH.removeAll();
			System.out.println("1번 클릭!");
			TextArea j1 = new TextArea("유동근 화이팅!");
			j1.setEditable(false);
			j1.setSize(400,200);
			j1.setLocation(15, 20);
			_bottomH.add(j1);
		} else if (choice.getSelectedItem().equals("G12034567")) {
			_bottomH.removeAll();
			System.out.println("2번 클릭!");
			TextArea j2 = new TextArea("유동근 화이팅!!!");
			j2.setEditable(false);
			j2.setSize(400,200);
			j2.setLocation(15, 20);
			_bottomH.add(j2);
		}
	}
}