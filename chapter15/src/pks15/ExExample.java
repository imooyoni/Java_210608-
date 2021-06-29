package pks15;

public class ExExample {

	public static void main(String[] args) {
		
		for(int i=0 ; i<10; i++) {
			System.out.println(i);
			if (i==5) {
				System.exit(i); //break 대용으로 사용됨 > break 사용할 필요가 없음 하지만 END를 읽지 않음!
				//break로 사용해도 무관함! >break로 읽으면 END까지 읽음 
			}
		}
		System.out.println("END!!");
		
	}

}
