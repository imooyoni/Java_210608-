package pk14;

public class BookShelf extends Shelf implements Queue{
	
	//구현되어 있는 구현메서드
	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0); //지우면서 지워지는 원소(데이터)를 반환해줌
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

	
}
