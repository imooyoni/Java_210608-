package pk12;
		//CalMinus클래스를 만들어 Calculator클래스를 상속받으세요.
		//오버라이딩을 이용하여 Calculator의 getResult()함수를
		//인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.
public class CalMainus extends CalculatorExam{

	@Override
	public int getResult(int n1, int n2) {
		if (n1<n2) {
			int temp;
			temp=n1;
			n1 = n2;
			n2=temp;
		}
		int mainus = n1 - n2;
		return mainus;
	}
	
	

}
