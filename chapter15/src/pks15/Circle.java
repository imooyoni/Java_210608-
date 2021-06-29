package pks15;


//복제는 private에 위배되므로 반드시 Cloneable(복제권한)을 선언해야 함
public class Circle implements Cloneable{//implements Cloneable 선언이 없으면 복제가 불가함

	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		//Point클래스의 객체생성 Point point = new Point(x,y);
		point = new Point(x, y);
		this.radius=radius;
	}

	@Override
	public String toString() {//주소가 지칭하고 있는 내용이 스트링을 통해 출력 > 타입을 스트링으로 바꿈 
		// TODO Auto-generated method stub
		return "원점은 "+point+"이고 반지름은 "+radius+"입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
