package pk13;

public class AnimalExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		//각각의 객체를 만들어서 Cat과 Dog의 사운드 메서드 호출
		System.out.println("---각각의 객체 생성---");
		Cat cat = new Cat();
		cat.sound();
		System.out.println();
		Dog dog = new Dog();
		dog.sound();
		
		System.out.println("---자동형변환(Upcasting)---");
		Animal cat1=new Cat();
		cat1.sound();
		
		Animal dog1=null;//초기화가 안되어있는 상태
		dog1=new Dog();//heap 할당
		dog1.sound();//멍멍
		
		System.out.println();
		dog1=new Cat();//another heap 할당
		dog1.sound();//야옹
		
		System.out.println();
		
		System.out.println("---메서드 사용(매개변수)---");
		animalSound(new Cat());
		System.out.println();
		animalSound(new Dog());
	}//main
	

}
