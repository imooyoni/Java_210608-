package pk20;

public interface Add {
	//메서드가 변수처럼 사용되어서 결과만 들어가는 것
	public int add(int x, int y);
	
	

}

//람다 lambda expression : 함수형 프로그래밍 // 자파 8이상부터 사용가능
/* 클래스를 생성하지 않고 함수의 호출만으로 기능을 수행 
 입력받은 자료를 기반으로 수행되므로 외부에 영향을 미치지 않음
 그러므로 병렬처리 가능
 */
