package pk6;

public class Book {
	
	public String bookName; //�������
	public String author;	//�������	
	
	//bookname = "�鼳����";
	
	//�޼ҵ峪 �����ڴ� ���� �̸��� �ߺ��� �� ����.
	//�׷��� �Ű������� ������ Ÿ���� �ٸ��� ���� �̸��� �� �� �ִ�.
	// >> �������� ������
	
	//�������� ������ = �����ε�
	public Book() {};		//������ : Ŭ������ �ʱ�ȭ >> �ν��Ͻ������� ���� ����� �ž�
	//Book bk = new Book; >> �ڿ��ִ� Book���� �ʿ��� �޼ҵ尡 ����Ǿ� �ִ� ����!
	
	public Book(String bookName, String author) { 
		//this(�������)�� �������� ������ ���� ����� Book �ȿ� bookName�� �����
		this.bookName=bookName;
		this.author=author;
	}
	
	//��ü
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
