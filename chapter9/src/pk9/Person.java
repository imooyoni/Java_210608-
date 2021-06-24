package pk9;

public class Person {

	String name;
	int age;
	
	Person() {
		this("이름없음", 1);
	}
	
	Person(String name, int age) {//멤버변수를 받을 때 사용하는게 this
		this.name=name;
		this.age=age;
	}
	
	Person returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {
		Person nName = new Person();
		Person sName = new Person("김수진", 32);
		//기본생성자 객체
		System.out.println(nName.name +"님 "+ nName.age + "세");
		//오버로딩생성자 객체
		System.out.println(sName.age + "세 " +sName.name);
		
		System.out.println(nName.returnSelf());
	}

}
