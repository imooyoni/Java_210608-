package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		//해당 학생의 점수를 보
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		//저장된 총 entry 수 얻기
		System.out.println("총 Entry 수 : " + map.size());
		
		/* 
		 hashcode가 재정의 되어 있지 않으면 super클래스의 주소를 반환하므로
		 sno로 재정의하여 entry의 중복을 막아줘야 한다. 
		 */
	}

}
