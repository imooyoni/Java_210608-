package pks15;

import javax.swing.JOptionPane;

public class ExtendsExampleMain {

	public static void main(String[] args) {
		//String
		ExtendsExample v1 = new ExtendsExample();
		v1.setValue("TEST");
		System.out.println(v1.getValue());
		
		//Integer
		ExtendsExample v2 = new ExtendsExample();
		v2.setValue(100);//AutoBoxing 처리가 됨(자동형변환이 됨 > 객체가 되어 들어옴)
		
		//언박싱(ver.5 이하)
		int i1 = (Integer)v2.getValue(); //Integer > Int
		//언박싱(ver.5 이상)
		int i2=(int)v2.getValue(); //Object 상속을 받을 때 Integer로 받음! 객체 사용을 위해서는 Integer를(클래스) int(객체)로 변경해줘야함!
		System.out.println(i2 + 10);
		
		//값 받기
		//언박싱
		
		
	}

}
