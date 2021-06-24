package pk5;

import javax.swing.JOptionPane;

public class SwitchCase01 {

	public static void main(String[] args) {

		/*
		int ranking=Integer.parseInt(JOptionPane.showInputDialog("등수를 입력해주세요"));
		
		// int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		
		case 1:medalColor='G'; // if 문에서 else if 같은 느낌
						break;
		
		case 2:medalColor='S';
						break;
		
		case 3:medalColor='B';
						break;
		
		default :
			medalColor='A'; // if문에서 else 같은 느낌 //default는 브레이크가 필요 없음!
			
		}
		
		System.out.println(ranking + "등 메달은 : " + medalColor + "입니다.");
		*/
		
		
		int ranking = 4;
		char medalColor='A'; //default를 주지 않으려면 medalColor에 초기값을 설정하면 됨!
		
		switch(ranking) {
		
			case 1:medalColor='G'; 
						break;
		
			case 2:medalColor='S';
						break;
		
			case 3:medalColor='B';
						break;
		}//switch
		
		System.out.println(ranking + "등 메달은" + medalColor +"입니다.");
		
	}//main

}//class