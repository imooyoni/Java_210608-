package pk13;

public class ComputerTest {

	public static void main(String[] args) {

		//Computer c1 = new Computer();//Error : �߻�Ŭ������ �ν��Ͻ� �� �� ����.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();//Error:
		Computer c4 = new MyNoteBook();
		
		c2.typing();
		c4.typing();
	}

}
