  
package pk11;

public class Child extends Parent{

	//재정의됨
	@Override//(애너케이션,에뜨라도 읽음) >> 생략이 가능함
	public void method2() {
		System.out.println("child-method2()");
	}
	
	public void method3() {
		System.out.println("child-method3()");
	}

	
}