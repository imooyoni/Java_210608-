package pk13;

public class ComputerTest {

	public static void main(String[] args) {

		//Computer c1 = new Computer();//Error : 추상ㅇ클래스는 인스턴스 할 수 없다.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();//Error:
		Computer c4 = new MyNoteBook();
		
		c2.typing();
		c4.typing();
	}

}
