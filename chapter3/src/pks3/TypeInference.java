package pks3;
//자바 version 10이상부터 적용됨, 상수선언은 아님!
public class TypeInference {

	public static void main(String[] args) {
	
		int i=10;
		var j=10.0;// var을 dluble로 선언한 것과 같음
		var str="hello"; // var을 String으로 선언한 것과 같음
		
		i=100;
		str="test";
		j=10.5;
				
		//str=3; Type Error 
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		

	}

}
