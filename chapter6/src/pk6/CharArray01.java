package pk6;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {
		
		String str[] = {"ab111", "cd222", "ef333", "gh444", "if555"};
		String res="";
		int i;
		
		for (i=0; i<str.length; i++) 
			
			res+=str[i]+"\n"; //"\n" ���� (������)
			System.out.println(res);
			
			JOptionPane.showMessageDialog(null, "�迭������ ��\n" + res); //�޼����� �ѷ��� �ʱⰪ�� null 
		
	}

}
