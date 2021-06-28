package pks15;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf("300");
		
		Integer total1 = obj1 + obj2;
		Integer total2 = obj1 + obj3;
		
		System.out.println("Integer total1 : "+total1);
		System.out.println("Integer total2 : "+total2);
		
		int values1 = obj1.intValue();
		int values2 = obj2.intValue();
		int values3 = obj3.intValue();
		
		int total3 = values1 + values2;
		int total4 = values1 + values3;
		
		System.out.println("UnBoxing total3 : " + total3);
		System.out.println("UnBoxing total4 : " + total4);
	}

}
