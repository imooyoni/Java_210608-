package pk7;
//���۷��� ����
public class FunTest05 {

	int value; //������� a=10
	
	//public FunTest05() {} //����Ʈ �޼ҵ带 �����ߴ��� ����Ʈ�� ���� ���ָ� �״�� ��밡����.
	
	//�����ε� �� �����ڴ� ����Ʈ �����ڰ� �ݵ�� ��õǾ�� �Ѵ�. 
	//��, ����Ʈ �޼ҵ带 ���� ���� ��� ��� ��
		FunTest05() {} //����Ʈ ������ > Ŭ������ ����� ����! �ڵ� �����Ǿ� ����!
	
	//	FunTest05() { value=a;}
	
	//this �ؼ� : this�� Ŭ������ �ִ� 
	//������ : Ŭ������ �ʱ�ȭ
	/*(public)*/ FunTest05(int value) {//�Ű������� �ְ� ���� ���� �ٸ������� �ν��ؼ� �ߺ����� ����(�����ε�) 
		this/*Ŭ������ �ִ�*/.value=value; //python ���� self
	}

	
	public static void swap(FunTest05 x, FunTest05 y) {
		//swap �˰���
		int temp = x.value;
		x.value=y.value;
		y.value=temp;
		
		System.out.println("swap() ����� : x= " + x.value + ", y= "+y.value);
	}
	
	public static void main(String[] args) {

		
		FunTest05 a = new FunTest05(10);
		System.out.println(a); //pk7.FunTest05@41a4555e = 10
		FunTest05 b = new FunTest05(20);
		System.out.println(b);//pk7.FunTest05@3830f1c0 = 20
		
		System.out.println("swap() ȣ�� �� : a= " + a.value + ", b= "+b.value);
		System.out.println("====================");
		
		//��ü�� �����Ͽ� ȣ��
		swap(a,b);//���簪�� �Ѱ��� ���̶� a,b�� ������ ����!
		
		System.out.println("====================");
		//heap�޸� ������ ���̹Ƿ� �ٲ�
		System.out.println("swap() ȣ�� �� : a= " + a.value + ", b= "+b.value);
		
	}

}
