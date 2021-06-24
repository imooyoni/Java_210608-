package pks3;

public class ImplicitConversion {

	public static void main(String[] args) {
		//묵시적 형변환
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		//두 개의 변수 모두 숫자인 경우 보다 정밀한 자료형으로 출력됨, 자동으로 형변환 이루어짐(묵시적형변환)
		
		System.out.println(iNum2);
		System.out.println(fNum);

		double dNum;
		dNum=fNum+iNum;
		
		System.out.println(dNum);
	}

}
