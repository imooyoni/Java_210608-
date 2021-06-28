package pks15;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1=new Object();
		Date obj2=new Date();
		
		
		System.out.println("Object : " + obj1);
		System.out.println("Object : " + obj1.toString()); //16진수의 주소에서 string 택스트로 변형(한글처리할 때 사용함)
		
		System.out.println("Object : " + obj2);
		System.out.println("Object : " + obj2.toString());
	}

}
