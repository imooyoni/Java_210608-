package pks15;

public class ValueCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[-128 ~ 127 초과했을 경우]"); //byte, int, short
		Integer obj1=300; //heap메모리를 사용 >> 박싱한다!
		Integer obj2=300;
		
		System.out.println("1. 결과 : " + (obj1==obj2));//오버플로우 되어서 값이 같아도 다른 것으로 인식
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("----언박싱 후 ----");
		System.out.println("2. 결과 : " + (obj1.intValue()==obj2.intValue()));
		System.out.println(obj1.intValue());
		System.out.println(obj2.intValue());
		System.out.println("----equals메서드----");
		System.out.println("3. 결과 : " + (obj1.equals(obj2)));//Integer 클래스의 경우 equals메서드를 사용하면 .intvalue 한 값과 같다!
		
		System.out.println();
		System.out.println("[-128 ~ 127 범위내의 경우]");//범주 내에 있는 경우 값으로 인식함
		Integer obj3=123;
		Integer obj4=123;
		
		System.out.println("1. 결과 : " + (obj3==obj4));
		System.out.println("2. 언박싱 후 결과 : " +(obj3.intValue()==obj4.intValue()));
		System.out.println("3. equals 메서드 결과 : "+(obj3.equals(obj4)));
	}

}
