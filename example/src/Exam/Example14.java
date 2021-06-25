package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example14 {
	/*String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW", "APPLE"};
	WordScramble 클래스를 만들어 위와같은 배열을 선언하고, 이를 이용하여
	WordScrambleMain클래스에서 실행했을 때 아래의 결과가 출력되게 해 보자.

	실행결과 : 
	문제 :PEALP
	단어는? : ealpp
	ealpp오답...
	단어는? : apple
	apple정답!!!!*/
	
	String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW", "APPLE"};
	String shake = "";
	
	//정답 반환 메서드
	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];//랜덤으로 뽑은 정답 단어!
	}//getAnswer
	
	//단어를 섞어서 반환하는 메서드
	public String getScrambleWord(String str) {
		
		//정답단어를 문자 단위로 끊어서 저장
		//int배열 생성
		int[] inArr = new int[str.length()]; //str 단어의 char 수가 inArr
		
		//만들어진 inArr배열의 각 방에 겹치지 않도록 처리한 난수를 입력
		
		for(int i=0; i<inArr.length;) {//메모리 확보
			inArr[i] = new Random().nextInt(str.length()); //섞어서 들어감!
			//i=0에 랜덤으로 뽑은 char가 들어감!
			
			//중복사항을 판단하는 변수 시작!
			boolean check = false; 
			//중복성 제거(버블정렬) 알고리즘(정렬할때 주로 사용)
			for(int j=0; j<i;j++) {
				if (inArr[i] == inArr[j]) {//랜덤으로 뽑은 단어랑 비교하던 단어랑 같냐?
					check = true; //같으면
					break;//멈춰!
				}//if
			}//in for
			
			//중복이 되지 않으면 i를 증가시킴!
			if(!check) {//중복이 없을때 check=false
				i++;
			}//if2
		}//out for
			//중복사항을 판단하는 변수 끝!
		
		for(int i=0; i<str.length();i++) {
			//str을 문자 단위로 나누어 넣어줌
			//위의 코드에서 발생시킨 난수의 순서대로 섞어서 변수에 추가함
			shake+=str.charAt(inArr[1]);
		}
		return shake;
	}
	
}//class	
	

