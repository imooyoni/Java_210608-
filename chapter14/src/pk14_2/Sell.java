package pk14_2;

public interface Sell {
	
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
