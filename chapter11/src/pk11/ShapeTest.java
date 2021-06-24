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
		System.out.println("����� �Դϴ�.");
	}
	
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("�簢�� �Դϴ�.");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("�ﰢ�� �Դϴ�.");
	}
}

public class ShapeTest {
	//<Shape> : Shape�� �������� Shape Ŭ������ Shape�� ��ӹ��� ��� Ŭ������ ���� ��������
	//�̹� Circle ???�� ������ �Ǿ� �ִ� ���̶�� �����ϰ� ���
	ArrayList<Shape> sList = new ArrayList<Shape>(); //Ÿ�Կ� ���Ѿ��� � ���̵� �޾���, �迭�� ũ�⵵ �Է��� ��ŭ�� �Ҵ����� >>size�� �ڸ�
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest sTest = new ShapeTest();
		System.out.println("--- ��ĳ���� ---");
		sTest.addShape();
		System.out.println("--- �ٿ�ĳ���� ---");
		sTest.testCasting();
	}
	
	public void addShape() {
		sList.add(new Circle());// Circle cr = new Circle();
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		//��ĳ���� enhanstance ����
		//�������̵��� ����Ǿ� �θ�Ŭ������ �ƴ� �ڽ�Ŭ������ ���� ����!
		
		for (Shape s : sList) {
			s.draw();
		}
		
	}
	
	//else if�� �����ϰ� �������� "�������� �ʴ� �����Դϴ�" ���
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s = sList.get(i); //�ϴ� Shape Ÿ������ ������
			
			//���ʿ� �θ�Ŭ���� �����ʿ� �ڽ�Ŭ����
			if(s instanceof Circle) { //circle�� s�� ���ϴ� Ŭ�����̸�
				Circle c = (Circle)s; //�ٿ�ĳ���� Circle�� ����ȯ
				c.circle();
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.rectangle();
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				t.triangle();
			} else
				System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		
	}
}
