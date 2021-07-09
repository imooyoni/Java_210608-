package frame;

import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

import movieVO.Movie;

public class FrameReviewRead extends JPanel{

	public FrameReviewRead(Movie m) {
		// TODO Auto-generated constructor stub
		
		//후기 출력 창
	      TextArea review =	new TextArea("평점\t이름\t\t\t한줄평\n", 0, 0,TextArea.SCROLLBARS_VERTICAL_ONLY);
	      review.setEditable(false);
	      review.append(m.getReview()); //데이터(DAO)에 있는 것을 가져
	      review.setSize(800,300);
	      review.setLocation(700,200);
	      review.setFont(new Font("맑은고딕",Font.PLAIN,18));
	      add(review);
	      
	    //새로운 서브 프레임 구현 >> 분리되어서 올라온 새로운 창!
	      Frame fr= new Frame();
	      fr.setTitle(m.getmName()+"의 리뷰");
	      fr.setSize(800, 300);
	      fr.setLocation(700, 200);
	      fr.add(review);
	      fr.setVisible(true);
	      
	      //리뷰창의 x를 눌렀을 때 System.exit(0)를 하면 예매프로그램 자체가 종료되므로
	      //dispose()를 통해 서브 프레임만 종료해줘야 한다.
	      fr.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            fr.setVisible(false);
	            fr.dispose();//창하나만 닫은것!
	         }
         });//클래스 안에 들어가는 메서
      }   
}
	
