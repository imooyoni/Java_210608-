package pk6;

//���� ���� >> �������� ������ �ְ� ���纻�� ������ ���� ����!
public class ArrayCopy04 {

	public static void main(String[] args) {

		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3];
	
		bookArray1[0]=new Book("�¹���","���淡");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");
		
		bookArray2[0]=new Book(); //��ü�� ���� ����
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());//1�� �ִ� ���� �����ͼ�(get) 2���� ����(set)����
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());			
		}
		
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("--�� ��--");
		
		bookArray1[0].setBookName("�� ��");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); 
		}
		
		System.out.println("--���纻--"); // ������ ����� ������ ���纻���� �����Ű�� �ʹٸ� ���纻 ����ϱ� ���� set/get �ѹ� �� �ݺ����־�� ��.
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 
		}
	}

}
