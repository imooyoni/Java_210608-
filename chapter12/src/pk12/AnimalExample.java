package pk12;

public class AnimalExample {
	
	public static void main(String[] args) {
		Bear bear = new Bear();
		Lion lion = new Lion();
		Animal spider = new Spider(); //�θ�Ÿ������ ����ȯ
		
		System.out.println("---��---");
		System.out.println("�� : "+bear.getEye());
		System.out.println("�ٸ� : "+bear.getLeg());
		System.out.println(bear.woong);
		
		System.out.println("---����---");
		System.out.println("�� : " + lion.getEye());
		System.out.println("�ٸ� : " + lion.getLeg());
		System.out.println("---�Ź�---");
		System.out.println("�� : " + spider.getEye());
		System.out.println("�� : " + spider.getLeg());
		
	}

}
