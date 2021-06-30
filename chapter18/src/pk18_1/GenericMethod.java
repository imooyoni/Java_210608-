package pk18_1;

public class GenericMethod {

	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		//가로 T
		double left = ((Number)p1.getX()).doubleValue();//0
		double right = ((Number)p2.getX()).doubleValue();//10
		//세로 V
		double top = ((Number)p1.getY()).doubleValue();//0.0
		double bottom = ((Number)p2.getY()).doubleValue();//10.0
		
		//가로
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//매개변수
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10,10.0);
		
		double rect = GenericMethod.<Integer, Double> makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 : " + rect + "입니다.");
	}

}
