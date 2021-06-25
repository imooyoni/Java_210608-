package pk14;

public class InterTestExam implements InterTest{

	@Override
	public int getA() {
		//A=200 ERROR > final이 기본형이라서
		return A;//Intertest의 상수값
	}
	

}
