package pk6;

import javax.swing.JOptionPane;

public class TwoDimension03 {

	public static void main(String[] args) {
/*
		int[][] javaScore=new int[2][3];
		
		int java = 0;
		
		for (int i=0; i<javaScore.length; i++) { //0, 1
			for (int j=0; j<javaScore[i].length; j++) {//�ڹٽ��ھ��� ����(3)��ŭ ���ƶ� //0, 1, 2
				
				java=Integer.parseInt(JOptionPane.showInputDialog("javaScore")); //user�� �Է��ϴ� ��
				javaScore[i][j]=java;											 //
				System.out.println("javaScore["+i+"]["+j+"]="+javaScore[i][j]);
			}
		}
		System.out.println();
*/		
		/*
		String python;
		
		String[][] pythonScore=new String[2][3];
		
		for (int x=0; x<pythonScore.length; x++) {
			for (int y=0; y<pythonScore[x].length; y++) {
				
				python=JOptionPane.showInputDialog("pythonScore");
				pythonScore[x][y]=python;
				System.out.println("pythonScore["+x+"]["+y+"]="+pythonScore[x][y]);
			}
		}
		
		
		int python = 0;
		int[][] pythonScore=new int[2][];
		
		pythonScore[0]=new int[2];//1���� 2��
		pythonScore[1]=new int[3];//2���� 3��
		
		for(int i=0; i<pythonScore.length; i++) {
			for(int j=0; j<pythonScore[i].length; j++) {
				python=Integer.parseInt(JOptionPane.showInputDialog("pythonScore"));
				pythonScore[i][j]=python;
				System.out.println("pythonScore["+i+"]["+j+"]="+pythonScore[i][j]);
			}
		}
		*/
		System.out.println();
		
		int[][] Bigdata = {{70,80},{92,96,80}};
		for (int i=0; i<Bigdata.length; i++) {
			for(int j=0; j<Bigdata[i].length; j++) {
				System.out.println("Bigdata["+i+"]["+j+"]="+Bigdata[i][j]);
			}
		}
	}

}
