package pk6;

public class BookArray02 {
	public static void main(String[] args) {
		Book[] library=new Book[5];
		//library.getAuthor();
		
		library[0]=new Book("�¹���","���淡");
		library[1]=new Book("���̾�","�츣�� �켼");
		library[2]=new Book("��� �� ���ΰ�","���ù�");
		library[3]=new Book("����","�ڰ渮");
		library[4]=new Book("�����","�������丮");
		
		// >> ���� ������ �ڵ�! 
		//System.out.println(library[i]); //���� ��¹��� 5�� �ۼ��ؾ���!
		
		//System.out.println(library[0].bookName); >>����õ ��¹�
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();//���̺귯�� i��°�� �ҷ��ͼ� showBookInfo�޼ҵ带 ������
		}
		
		System.out.println();
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
