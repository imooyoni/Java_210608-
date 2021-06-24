package pk11;

import javax.swing.JOptionPane;

//상속
public class Berry extends Fruit{ 
	//메인에서 푸룻과 베리 모두 함께 쓰고 싶을 때, 베리만 객체로 받아서 사용하면 모두 사용이 가능함
	
	private String size;
	private String name;
	
	public void Set2(String a, String b) {
		size = b;
		name=a;
		
	}

	public void Disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + size);
	}	

}
