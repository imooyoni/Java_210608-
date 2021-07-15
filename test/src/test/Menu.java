package test;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Menu extends Frame  {
	
	public void Menu() {
	
		
		Frame frame=new Frame("메뉴");//프레임의 제목
		frame.setLayout(null);
		frame.setBounds(800,100,600,800); //(x좌표, y좌표, 너비, 높이)
		frame.setBackground(Color.yellow);//배경색
		frame.setVisible(true); //false는 화면에 보이지 않음
		
		
		
		
		JPanel bottomSet = new JPanel();

		   bottomSet.setBounds(0, 660, 600, 100);
		   bottomSet.setBackground(Color.yellow);
		   bottomSet.setLayout(null);
		

		   JButton btnReview = new JButton("예매하기");
		 
		   
		   btnReview.setSize(183, 87);
		   btnReview.setLocation(15, 0);
		   btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   btnReview.setVisible(true);
		   bottomSet.add(btnReview);
		   
		  
			
			
		      
		   
		   JButton btnHome = new JButton("예매확인");

		   
		   btnHome.setSize(183, 87);
		   btnHome.setLocation(208, 0);
		   btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   bottomSet.add(btnHome);
		   btnHome.setVisible(true);
		   
		  
		   
		   JButton btnBuy = new JButton("출발지정보");

		   
		   btnBuy.setSize(183, 87);
		   btnBuy.setLocation(401, 0);
		   btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   bottomSet.add(btnBuy);
		   btnBuy.setVisible(true);

		   frame.add(bottomSet);

		   TextArea story = new TextArea("                           버스 예매시 주의사항\n\n"+
		   	 "1.한번 예매한 좌석은 변경과 환불이 어려울수 있습니다.\n\n"+"2.버스기사에게 대들시 소지하신 귤을 뺏길수 있습니다.\n\n"
		   	 		+ "3.본 버스는 휴게소 이용이 불가능합니다.\n\n" +"4.본 버스의 승차비용은 오직 귤로만 결제할수있습니다.\n\n"
		   	 		+"5.버스에서 음주와 흡연적발시 경고없이 추방조치합니다.\n\n"+"6.버스안에서의 과도한 수면은 목적지 도착이 어려워질수 있습니다.\n\n"
		   	 		+ "7.버스에서 기물파손시 솔데스크측에서 배상을 요구할수있습니다.\n\n"+"8.기사님에게 주는 애정은 목적지 도착이 빨라질수 있습니다.\n\n" +"9.자세한 사항은 개발팀에게 물어봐도 알려주지 않습니다."
		   	 		
					);
			story.setBounds(25, 40, 555, 600);
			
			story.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
			frame.add(story);
		   
		   btnBuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StartingPoint t=new StartingPoint();
				t.StartingPoint();
			}
		});
		   
		
		frame.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	
	});
	
	}
	

}


	
	


		
