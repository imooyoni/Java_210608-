package pks3;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum=1000;//32��Ʈ
		byte bNum=(byte)iNum; //8��Ʈ -128~127
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum1=1.2;
		float fNum1=0.9f;
		
		int iNum2=(int)dNum1 + (int)fNum1;
		
		System.out.println(iNum2);
	}

}
