package pk9;

import java.util.Scanner;

public class Person2Main {

	public static void main(String[] args) {

		Person2 personkim = new Person2();
		Person2 pskim = new Person2();
		Scanner scan=new Scanner(System.in);
		
		personkim.name="������";
		personkim.height=185.0f;
		personkim.weight=85.5f;
		
		System.out.println(personkim.name);
		System.out.println(personkim.height);
		System.out.println(personkim.weight);
		
		System.out.println();
		
		System.out.print("�̸� : ");
		pskim.name=scan.next();
		
		System.out.print("Ű : ");
		pskim.height=scan.nextFloat();
		
		System.out.print("������ : ");
		pskim.weight=scan.nextFloat();
		
		
		Person2 ps1 = new Person2("����", 188f, 75.3f);
		System.out.println(ps1.name+"�� Ű�� " + ps1.height + "cm, �����Դ� " + ps1.weight+"kg �Դϴ�.");
	}
}
