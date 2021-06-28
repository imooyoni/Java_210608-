package pks15;

class Bk {
	
	String title;
	String author;
	
	public Bk(String title, String author) {
		
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ", " + author;
	}
	
}


public class TostringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bk bk = new Bk("자바", "솔데스크"); 
		//BK 메소드에 이미 tostring 처리가 되어 있기 때문에 변수방을 읽던, 변수방.tostring처리를 하던 똑같은 값 출력됨
		System.out.println(bk);
		System.out.println(bk.toString());
	}

}
