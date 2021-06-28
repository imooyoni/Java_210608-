package pk14;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("태백산맥1"); //queue에 enqueue메서드를 통해서 shelf arraylist에 방을 만듬
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.getSize()+"권의 책이 입고됨");
		System.out.println("----------------------------");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("출고 후 책 재고 : " + shelfQueue.getSize() + "권");
	}

}
