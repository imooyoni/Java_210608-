package pk6;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//�迭ũ�� 3��¥�� BookŬ������ �ν��Ͻ� ���� ����
		Book bookArray1[] = new Book[3]; 
		Book bookArray2[] = new Book[3];
	
		bookArray1[0]=new Book("�¹���","���淡");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //���縸 �ϴ� ��
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //show ��� �޼ҵ带 �̿��ؼ� ����ϴ� ��
		}
		//������ �ٲ�� ����, ������ �ٲ��� �ʴ� ���� �� ������ ����.
	}

}
