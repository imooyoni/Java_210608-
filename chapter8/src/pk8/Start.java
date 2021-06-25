package pk8;

import java.util.Random;
import java.util.Scanner;

public class Start {

	private int random= new Random().nextInt(50)+1;
	private int count;
	private String result = "FAIL";
	
	public String check(int n) {

		count++; //이 메서드를 한번 읽을 때마다 count가 올라감
		
		if(n<random) {
			System.out.println("UP!");
		}
		else if(n>random) {
			System.out.println("DOWN!");
		}
		else if(n==random) {
			System.out.println(count + "회 만에 맞았네요 :)");
			result = "SUCCESS"; //정답을 맞췄을때만 결과값을 바꿔줌
		}	
		return result;//String 자료형이므로 리턴값을 반환해야 하는데, 맞았을 때는 SUCCESS 틀렸을 때는 FAIL을 반환함
	}//check
}//class

