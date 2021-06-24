package pk12;

public class AnimalExample {
	
	public static void main(String[] args) {
		Bear bear = new Bear();
		Lion lion = new Lion();
		Animal spider = new Spider(); //ºÎ¸ðÅ¸ÀÔÀ¸·Î Çüº¯È¯
		
		System.out.println("---°õ---");
		System.out.println("´« : "+bear.getEye());
		System.out.println("´Ù¸® : "+bear.getLeg());
		System.out.println(bear.woong);
		
		System.out.println("---»çÀÚ---");
		System.out.println("´« : " + lion.getEye());
		System.out.println("´Ù¸® : " + lion.getLeg());
		System.out.println("---°Å¹Ì---");
		System.out.println("´« : " + spider.getEye());
		System.out.println("´« : " + spider.getLeg());
		
	}

}
