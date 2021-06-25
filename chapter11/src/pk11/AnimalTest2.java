package pk11;

import java.util.ArrayList;

public class AnimalTest2 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		System.out.println("--- 자동형변환 ---");
		aTest.addAnimal();
		System.out.println("--- 다운캐스팅 ---");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Tiger());//Animal형으로 형변환을 해서 추가
		aniList.add(new Human());//Animal형으로 형변환을 해서 추가
		aniList.add(new Eagle());//Animal형으로 형변환을 해서 추가
		//Animal ani1=new Human(); Human/Tiger/Eagle을 Animal로 자동형변환
		for(Animal a: aniList) {//animal타입의 aniList(배열의 요소)를 모두 꺼내와 move호출
			a.move();//오버라이딩된 메서드만 호출
			//부모타입이므로 자식의 메서드는 안보임
		}
	}
	
	public void testCasting() {
		
		for (int i=0; i<aniList.size();i++) {
			Animal a = aniList.get(i);

			if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.move();
			}//if
			else if (a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
				h.move();
			}
			else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
				e.move();
			}
			else {
				System.out.println("일치하는 타입이 존재하지 않습니다.");
			}
				
		
			
		}
	}

}