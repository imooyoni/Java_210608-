package pk7;

public class FunTest04 {

	//call by value
	public static void swap(int x, int y) {
		//swap �˰���
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("swap() ����� : x= " + x + ", y= "+y);
	}
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() ȣ�� �� : a= " + a + ", b= "+b);
		System.out.println("====================");
		
		swap(a,b);//���簪�� �Ѱ��� ���̶� a,b�� ������ ����!
		
		System.out.println("====================");
		System.out.println("swap() ȣ�� �� : a= " + a + ", b= "+b);
		
		//FunTest05 f5 = new FunTest05(5);
		//System.out.println(f5);
	}
	 
	//funtest05��� �����͸� ����ǵ� ���� �ϳ��� �ݵ�� ���;���!
	
}
