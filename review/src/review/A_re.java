package review;

public class A_re {
	
	public A_re() {
		System.out.println("A 객체가 생성됨");
	}
	
	class B {
		
		int field1; //멤버변수?
		
		//생성자를 --해!
		public B() {
			System.out.println("B 객체가 생성됨");
		}
		
		public void bMethod() {
			
		}
	}
	
	static class C {
		int field1;
		static int field2;
		
		public C() {
			System.out.println("C 객체가 생성됨");
		}
		public void cMethod() {}
		public static void sMethod() {}
	}
	
	void aMethod() {
		
		class D {
			int field1;
			
			public D() {
				System.out.println("D 객체가 생성됨");
			}
			
			void dMethod() {
				
			}
		}
		
		D d = new D();
		d.dMethod();
		d.field1=3;
	}
}

