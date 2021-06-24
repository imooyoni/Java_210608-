package pk6;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		//확장포문
		
		String[] strArray= {"Java", "Python","Android","C","JavaScript"};
		/*
		for (int i=0; i<strArray.length; i++)
			System.out.println(strArray[i]);
		*/
		
		//[Ljava.lang.String;@2f92e0f4 (해시코드)메모리 주소:16진수로 표기됨
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		//[Ljava.lang.String;@2f92e0f4
		
		for(String lang/*아무렇게나 써도됨! 걍 이름*/ : strArray) { //strArray리스트를 통째로 가지고 와!
			System.out.println(lang);//통째로 넘겨받은 뭐시기를 하나씩 넘겨줌
		}//for
	}//main
}//class


//인핸스포문은 첨자가 통째로 저장됨