package collection.vector;

import java.util.List;
import java.util.Vector;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size(); 
		//같은 클래스 내에 있으면 'i<size' 와 같이 사용이 가능할 수도 있지만 권장하지 않으니 걍 메서드로 사용해!
		
		for(int i=0; i<list.size(); i++) {
			//Board board = list.get(i);
			//System.out.println(board.content + board.subject + board.writer);
			System.out.print(list.get(i).subject + "\t");
			System.out.print(list.get(i).content + "\t");
			System.out.print(list.get(i).writer);
			
			System.out.println();
		}
		
		System.out.println("========================================");
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			//Board board = list.get(i);
			//System.out.println(board.content + board.subject + board.writer);
			System.out.print(list.get(i).subject + "\t");
			System.out.print(list.get(i).content + "\t");
			System.out.print(list.get(i).writer);
			
			System.out.println();
		}
		
		System.out.println("========================================");
		list.remove(3);//제목5 줄이 3번 세트!
		
		for(int i=0; i<list.size(); i++) {
			//Board board = list.get(i);
			//System.out.println(board.content + board.subject + board.writer);
			System.out.print(list.get(i).subject + "\t");
			System.out.print(list.get(i).content + "\t");
			System.out.print(list.get(i).writer);
			
			System.out.println();
		}
		
	}

}
