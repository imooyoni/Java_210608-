package pk6;

import java.util.ArrayList;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		//ArrayList: �迭�� �����޸𸮸� ����(����� ��ŭ �޸� �Ҵ�)
		ArrayList<Book> library = new ArrayList<Book>();//Book�� ��� ����Ʈ��
		//����Ʈ �ؾ��� <>�÷����̶�� �̾߱��� �ȿ� ������ ��Ƶ� ��
		
		//Object �ڹٿ��� ���� ū ���ñ� ��� Ÿ�Կ� ���� ��밡��
		
		library.add(new Book("�¹���","���淡"));
		library.add(new Book("���̾�","�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�","���ù�"));
		library.add(new Book("����","�ڰ渮"));
		library.add(new Book("�����","�������丮"));
		
		for(int i=0; i<library.size();i++) {//size ũ�⸸ŭ
			Book book=library.get(i);//library[0] /index = ÷��
			book.showBookInfo(); //library[0].showBookInfo();�� ����
		}

		System.out.println();
		System.out.println("--���� for�� ���--");
		
		for (Book book : library) {//Book Ÿ�Կ��� library�� �ҷ���!
			book.showBookInfo(); 
			//>>�ؼ� �ʿ���... library�� ���������? ���� ���⿡ ������ �����ΰ�?, book�� �׳� ���ο� �̸��ΰ�?
		}
		/*
		Book[] library=new Book[10];
				
		library[0]=new Book("�¹���","���淡");
		library[1]=new Book("���̾�","�츣�� �켼");
		library[2]=new Book("��� �� ���ΰ�","���ù�");
		library[3]=new Book("����","�ڰ渮");
		library[4]=new Book("�����","�������丮");
		
		*/
	}

}
