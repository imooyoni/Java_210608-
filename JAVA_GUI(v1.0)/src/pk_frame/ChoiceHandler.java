package pk_frame;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String str = (String)e.getItem();
		System.out.println("지역 : " + str);
	}

}
