package pk13;

public class AnimalExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		//������ ��ü�� ���� Cat�� Dog�� ���� �޼��� ȣ��
		System.out.println("---������ ��ü ����---");
		Cat cat = new Cat();
		cat.sound();
		System.out.println();
		Dog dog = new Dog();
		dog.sound();
		
		System.out.println("---�ڵ�����ȯ(Upcasting)---");
		Animal cat1=new Cat();
		cat1.sound();
		
		Animal dog1=null;//�ʱ�ȭ�� �ȵǾ��ִ� ����
		dog1=new Dog();//heap �Ҵ�
		dog1.sound();//�۸�
		
		System.out.println();
		dog1=new Cat();//another heap �Ҵ�
		dog1.sound();//�߿�
		
		System.out.println();
		
		System.out.println("---�޼��� ���(�Ű�����)---");
		animalSound(new Cat());
		System.out.println();
		animalSound(new Dog());
	}//main
	

}
