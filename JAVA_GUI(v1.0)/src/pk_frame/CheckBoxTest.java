package pk_frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("설문조사");
		
		f.setBounds(500, 100, 800, 252); //전체 프레임의 크기
		f.setLayout(new FlowLayout());
		
		Label q1 = new Label("1.관심 분야는 무엇입니까? ");
		Checkbox news = new Checkbox("news", true); //처음부터 체크가 된 상태에서 시작함!
		Checkbox music = new Checkbox("music");
		Checkbox movie = new Checkbox("movie");
		Checkbox sports = new Checkbox("sports");
		
		//체크박스를 선택 여부 판단
		news.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getStateChange()==1? "뉴스 선택됨": "뉴스 선택해제"; //선택되어 있는 경우? 회원가입시에 기본 혜택을 준다던가; 조건2
				System.out.println(str);
			}
		});
		
		music.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getStateChange()==1? "음악 선택됨": "음악 선택해제"; //선택되어 있는 경우? 회원가입시에 기본 혜택을 준다던가; 조건2
				System.out.println(str);
			}
		});
		
		movie.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getStateChange()==1? "영화 선택됨": "영화 선택해제"; //선택되어 있는 경우? 회원가입시에 기본 혜택을 준다던가; 조건2
				System.out.println(str);
			}
		});
		
		sports.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getStateChange()==1? "스포츠 선택됨": "스포츠 선택해제"; //선택되어 있는 경우? 회원가입시에 기본 혜택을 준다던가; 조건2
				System.out.println(str);
			}
		});
		
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		q1.setFont(font);
		
		f.add(q1);
		f.add(news);
		f.add(music);
		f.add(movie);
		f.add(sports);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		//배타적 선택 : 여러개 중 하나만 선택가능
		Label q2 = new Label("2. 영화는 한달에 얼마나 자주 보나요? ");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("5회 미만", group, true);//그룹에 소속되어 있음 표시, 기본으로 선택되어 있음
		Checkbox two = new Checkbox("5회 이상 10회 미만", group, false);
		Checkbox three = new Checkbox("10회 이상", group, false);
		
		q2.setFont(font);
		
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
		
		f.setVisible(true);
		
	}
}
