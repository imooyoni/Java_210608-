package pk14;

public interface Queue {

	//추상 메서드만 모여있는 추상 클래스
	void enQueue(String title);
	String deQueue();
	int getSize();
	
	
}
