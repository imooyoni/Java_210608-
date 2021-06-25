package pk11;

import java.util.ArrayList;

class Shape {
	
	void draw() {
		System.out.println("draw Shape");
	}
}


class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원모양 입니다.");
	}
	
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("삼각형 입니다.");
	}
}

public class ShapeTest {
	//<Shape> : Shape를 기준으로 Shape 클래스와 Shape를 상속받은 모든 클래스는 전부 참조가능
	//이미 Circle ???이 선언이 되어 있는 것이라고 생각하고 사용
	ArrayList<Shape> sList = new ArrayList<Shape>(); //타입에 제한없이 어떤 것이든 받아줌, 배열의 크기도 입력한 만큼만 할당해줌 >>size로 자름
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest sTest = new ShapeTest();
		System.out.println("--- 업캐스팅 ---");
		sTest.addShape();
		System.out.println("--- 다운캐스팅 ---");
		sTest.testCasting();
	}
	
	public void addShape() {
		sList.add(new Circle());// Circle cr = new Circle();
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		//업캐스팅 enhanstance 포문
		//오버라이딩이 진행되어 부모클래스가 아닌 자식클래스의 것을 읽음!
		
		for (Shape s : sList) {
			s.draw();
		}
		
	}
	
	//else if로 독립하고 나머지는 "지원되지 않는 형식입니다" 출력
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s = sList.get(i); //일단 Shape 타입으로 가져옴
			
			//왼쪽에 부모클래스 오른쪽에 자식클래스
			if(s instanceof Circle) { //circle이 s에 속하는 클래스이면
				Circle c = (Circle)s; //다운캐스팅 Circle로 형변환
				c.circle();
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.rectangle();
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				t.triangle();
			} else
				System.out.println("지원하지 않는 형식입니다.");
		}
		
	}
}