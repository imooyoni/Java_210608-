package pk6;

public class Book {
	
	public String bookName; //멤버변수
	public String author;	//멤버변수	
	
	//bookname = "백설공주";
	
	//메소드나 생성자는 같은 이름이 중복될 수 없다.
	//그러나 매개변수의 갯수나 타입이 다르면 같은 이름이 올 수 있다.
	// >> 생성자의 다형성
	
	//생성자의 다형성 = 오버로딩
	public Book() {};		//생성자 : 클래스를 초기화 >> 인스턴스변수를 만들어서 사용할 거야
	//Book bk = new Book; >> 뒤에있는 Book에서 필요한 메소드가 저장되어 있는 공간!
	
	public Book(String bookName, String author) { 
		//this(멤버변수)를 선언하지 않으면 가장 가까운 Book 안에 bookName을 사용함
		this.bookName=bookName;
		this.author=author;
	}
	
	//객체
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
