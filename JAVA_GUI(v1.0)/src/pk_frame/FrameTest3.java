package pk_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//싱글턴 >> 객체가 하나만 들어와서 총괄해주는것
		//화면 중앙에 프레임을 위치시키기(화면해상도에 따라 다를 수 있음)
		
		//awt.Toolkit >> 싱글턴으로 불러오기 
		//Toolkit beep() : 경고음 만들때 사용!
		//각종 중앙값 가져올 예정 : width/2, height/2
		
		Frame fr = new Frame("세번째");
		fr.setSize(400, 400);
		
		//Toolkit을 통해서 모니터해상도 얻어오기
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//비프음 출력
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
			tk.beep(); //1초 간격으로 beep음 출력
		}
		//모니터 해상도 출력
		Dimension di = tk.getScreenSize(); //해상도 얻어오기
		int monitorW = di.width;
		int monitorH = di.height;
		
		//모니터 가로세로 중앙에서 프레임의 가로 세로 중앙값 얻어오기
		int x = monitorW/2-fr.getWidth()/2;
		int y = monitorH/2-fr.getHeight()/2;
		
		fr.setLocation(x, y);//좌표값 주기
		fr.setVisible(true);
		
		
		
	}

}
