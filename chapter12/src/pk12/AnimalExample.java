package pk12;

public class AnimalExample {
	
	public static void main(String[] args) {
		Bear bear = new Bear();
		Lion lion = new Lion();
		Animal spider = new Spider(); //부모타입으로 형변환
		
		System.out.println("---곰---");
		System.out.println("눈 : "+bear.getEye());
		System.out.println("다리 : "+bear.getLeg());
		System.out.println(bear.woong);
		
		System.out.println("---사자---");
		System.out.println("눈 : " + lion.getEye());
		System.out.println("다리 : " + lion.getLeg());
		System.out.println("---거미---");
		System.out.println("눈 : " + spider.getEye());
		System.out.println("눈 : " + spider.getLeg());
		
	}

}
