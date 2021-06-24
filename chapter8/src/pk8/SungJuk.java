package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//멤버변수, 필드
	private String Std_num; //동일클래스에서만 사용가능
	private String Std_name;
	private int Java, Python, BigData;
	
	//생성자(
	
	//메서드
	public void Sum() {
		System.out.println("합계는 : " + (Java + Python + BigData));
	}
	
	public void Avg() {
		System.out.println("평균은 : " + (Java + Python + BigData)/3);
	}
	
	public static void main(String[] args) {
		SungJuk rec = new SungJuk();
		
		rec.Std_num = JOptionPane.showInputDialog("학번");
		rec.Std_name = JOptionPane.showInputDialog("성명");
		
		rec.Java = Integer.parseInt(JOptionPane.showInputDialog("Java 성적"));
		rec.Python = Integer.parseInt(JOptionPane.showInputDialog("Python 성적"));
		rec.BigData = Integer.parseInt(JOptionPane.showInputDialog("BigData 성적"));
		
		
		System.out.println(rec.Std_num + ", " + rec.Std_name + "의 성적입니다.");
		rec.Sum();
		rec.Avg();
		
	}

}
