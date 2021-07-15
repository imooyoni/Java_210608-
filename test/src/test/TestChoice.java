package test;

import java.awt.Choice;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestChoice extends JFrame{
	
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
		choice.setBounds(25,25, 300, 50);
		top.add(choice);
		
		//초이스에서 선택한 값이랑 이거랑 같으면 라벨을 bottom에 붙여주라
		if(choice.getSelectedItem().equals("N10234567")) {
			JLabel j1 = new JLabel("유동근 화이팅!");
			j1.setSize(400,200);
			j1.setLocation(15, 20);
			bottom.add(j1);
		} else if(choice.getSelectedItem().equals("N10234567")) {
			JLabel j1 = new JLabel("유동근 화이팅!");
			j1.setSize(400,200);
			j1.setLocation(15, 20);
			bottom.add(j1);
		}
		
		
	}

}
