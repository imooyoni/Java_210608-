package pk9;

import java.util.Scanner;

public class Person2Main {

	public static void main(String[] args) {

		Person2 personkim = new Person2();
		Person2 pskim = new Person2();
		Scanner scan=new Scanner(System.in);
		
		personkim.name="김유신";
		personkim.height=185.0f;
		personkim.weight=85.5f;
		
		System.out.println(personkim.name);
		System.out.println(personkim.height);
		System.out.println(personkim.weight);
		
		System.out.println();
		
		System.out.print("이름 : ");
		pskim.name=scan.next();
		
		System.out.print("키 : ");
		pskim.height=scan.nextFloat();
		
		System.out.print("몸무게 : ");
		pskim.weight=scan.nextFloat();
		
		
		Person2 ps1 = new Person2("공유", 188f, 75.3f);
		System.out.println(ps1.name+"의 키는 " + ps1.height + "cm, 몸무게는 " + ps1.weight+"kg 입니다.");
	}
}
