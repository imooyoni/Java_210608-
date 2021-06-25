package pk6;

import javax.swing.JOptionPane;

public class TwoDimension03 {

	public static void main(String[] args) {
/*
		int[][] javaScore=new int[2][3];
		
		int java = 0;
		
		for (int i=0; i<javaScore.length; i++) { //0, 1
			for (int j=0; j<javaScore[i].length; j++) {//자바스코어의 길이(3)만큼 돌아라 //0, 1, 2
				
				java=Integer.parseInt(JOptionPane.showInputDialog("javaScore")); //user가 입력하는 수
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
		
		pythonScore[0]=new int[2];//1행은 2열
		pythonScore[1]=new int[3];//2행은 3열
		
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
