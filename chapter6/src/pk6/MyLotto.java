package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		
		//로또번호 6개를 담을 배열준비
		int[] lotto=new int[6]; //0 1 2 3 4 5
		System.out.print("이번주 로또 예상번호 : ");
		outer : for(int i=0; i<lotto.length;) {//i++ 생략가능 >> 같은 칸에서 비교를 할 때는 이차원배열이 아니고 outer사용
			
			lotto[i]=new Random().nextInt(45)+1;
			
			//중복값을 비교하는 반복문
			
			for (int j=0; j<i; j++) {//j가 0부터 시작해서 i보다 작을 때까지 돌아
				if(lotto[i] == lotto[j]) { //lotto에서 현재의 i번째 방을 j번째와 비교해서 중복된게 있다면 다시 포문으로가
					continue outer;//같은게 있으면 무시 outer로 가
				}//if
			}//innerfor
			System.out.print(lotto[i] + " ");
			i++; //outer for문, 세번째 자리에 넣지 않는 이유는 똑같은 숫자가 나와서 6번째가 되면 멈추게 되어서 출력 이후 추가해서 반복!
		}//outerfor
	}//main

}//class
