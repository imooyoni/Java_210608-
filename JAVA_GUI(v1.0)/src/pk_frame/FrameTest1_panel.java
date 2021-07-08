package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest1_panel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프레임 설정
		Frame frame = new Frame("문장 입력기");
		frame.setBounds(800,100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		//폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);//글씨체, 효과, 크기
		
		//북쪽단
		//컴포넌트 하나로 묶어주는 기능
		//panel의 기본은 FlowLayout이다
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.GREEN);
		TextField tf = new TextField(10);//(n) >> n = 입력상자의 입력가능 텍스트 길이
		
		Button btn = new Button("입력");
		//btn.setEnabled(false);//기본값을 클릭할 수 없도록 비활성화 설정하는 방법
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//중앙단
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//남쪽단
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		//컴포넌트 배치
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		
		frame.setVisible(true); //화면에 뿌리기
		frame.setResizable(false); //창크기 조절
		//---------------------------------------------------------------
		
		tf.addTextListener(new TextListener() { //텍스트 입력에 대한 라인을 입력할때는 textlistener
			
			@Override
			public void textValueChanged(TextEvent e) {
				// TODO Auto-generated method stub
				if(tf.getText().equals("")){//내용이 없으면
					btn.setEnabled(false);//버튼 잠금
				}else{
					btn.setEnabled(true);//버튼 활성화
				}
			}
		});
		
		//---------------------------------------------------------------
		//Enter 버튼
		tf.addKeyListener(new KeyAdapter() {//awt 키보드 이벤트

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				//TextField에 엔터값이 감지되면 아래 TextArea에 내용 추가
				if(e.getKeyChar() == KeyEvent.VK_ENTER){ //엔터를 누르면
					ta.append(tf.getText()+"\n");//
					
					//텍스트필드 비워주고 포커스 이동
					tf.setText("");//입력하고 나서 텍스트 필드 비워!
					tf.requestFocus();//포커스를 맨 앞에 맞춰죠!
				}
			}
		});
		//---------------------------------------------------------------
		//입력 버튼
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//ta.setText(tf.getText());
				ta.append(tf.getText()+"\n");//텍스트 필드에 있는거 입력해주고 엔터쳐 주고
				//텍스트필드 비워주고 포커스 이동
				tf.setText("");//입력하고 나서 텍스트 필드 비워!
				tf.requestFocus();//포커스를 맨 앞에 맞춰죠!
			}
		});
		
		//---------------------------------------------------------------
		//닫기 버튼
		btnClose.addActionListener(new ActionListener() {//익명의 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {//기능을 넣는 것 > 이벤트 현상
				// TODO Auto-generated method stub
				System.exit(0); //닫아! 나가!
			}
		});
		
		//---------------------------------------------------------------
		//저장 버튼
		btnSave.addActionListener(new ActionListener() {//익명의 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {//기능을 넣는 것 > 이벤트 현상
				// TODO Auto-generated method stub
				String message = ta.getText();//메시지에 일단 텍스트 필드 내용 넣어!
				
				try {
					//경로 잡기 : FileDialog (save, open할때 사용하는 대화상자
					FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE); //객체 생성
					fd.setVisible(true); //화면에 뿌려
					//확인용
					System.out.println(fd.getDirectory() + fd.getFile());
					String path = fd.getDirectory() + fd.getFile();
					if(!message.equals("")) {//공백이랑 같은지 물어봐>>공백이 아니면 내용을 넣어!
					//스트림으로 path경로에 한번에 저장
						FileWriter fw = new FileWriter(path);//문자 단위로 한번에 쓰기
						BufferedWriter bw = new BufferedWriter(fw);//속도 빠르게!
						bw.write(message);

						//FileDialog의 취소버튼을 누르지지 않고 정상적으로
						//저장한 경우
						if( fd.getFile() != null ){
							JOptionPane.showMessageDialog(frame, path+"\n경로에 저장했습니다");
						}
						bw.close();//버퍼 닫아주기
					}else{
						//TextArea에 기록할 내용이 없다면...
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다");
					}
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		
		//---------------------------------------------------------------
		//종료버튼
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);;
			}
		});
		
	}//main

}//class
