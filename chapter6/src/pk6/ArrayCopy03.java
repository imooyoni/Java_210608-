package pk6;

public class ArrayCopy03 {

	public static void main(String[] args) {
		//�Ϲ� ����
		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3];
	
		bookArray1[0]=new Book("�¹���","���淡");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); 
		System.out.println("--������--");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 
		}
		System.out.println("--�� ��--");
		
		bookArray1[0].setBookName("�� ��");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); 
		}
		
		System.out.println("--���纻--");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 
		}
		
	}//main

}//class
