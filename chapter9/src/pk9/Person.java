package pk9;

public class Person {

	String name;
	int age;
	
	Person() {
		this("�̸�����", 1);
	}
	
	Person(String name, int age) {//��������� ���� �� ����ϴ°� this
		this.name=name;
		this.age=age;
	}
	
	Person returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {
		Person nName = new Person();
		Person sName = new Person("�����", 32);
		//�⺻������ ��ü
		System.out.println(nName.name +"�� "+ nName.age + "��");
		//�����ε������� ��ü
		System.out.println(sName.age + "�� " +sName.name);
		
		System.out.println(nName.returnSelf());
	}

}
