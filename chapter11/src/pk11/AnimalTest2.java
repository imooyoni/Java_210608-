package pk11;

import java.util.ArrayList;

public class AnimalTest2 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		System.out.println("--- �ڵ�����ȯ ---");
		aTest.addAnimal();
		System.out.println("--- �ٿ�ĳ���� ---");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Tiger());//Animal������ ����ȯ�� �ؼ� �߰�
		aniList.add(new Human());//Animal������ ����ȯ�� �ؼ� �߰�
		aniList.add(new Eagle());//Animal������ ����ȯ�� �ؼ� �߰�
		//Animal ani1=new Human(); Human/Tiger/Eagle�� Animal�� �ڵ�����ȯ
		for(Animal a: aniList) {//animalŸ���� aniList(�迭�� ���)�� ��� ������ moveȣ��
			a.move();//�������̵��� �޼��常 ȣ��
			//�θ�Ÿ���̹Ƿ� �ڽ��� �޼���� �Ⱥ���
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
				System.out.println("��ġ�ϴ� Ÿ���� �������� �ʽ��ϴ�.");
			}
				
		
			
		}
	}

}
