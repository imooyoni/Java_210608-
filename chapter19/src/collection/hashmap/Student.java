package collection.hashmap;

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) { //새롭게 힙메모리줘!
		this.sno = sno;
		this.name = name;
	}
	
	/* 
	 hashcode가 재정의(물리적인 주소) 되어 있지 않으면 super클래스의 주소를 반환하므로
	 sno와 name으로 재정의하여 entry의 중복을 막아줘야 한다. 
	 일반적으로 equals(논리적인 주소)를 통해서 재정의된멤버변수를 사용한다.
	 */
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) { //obj가 스튜던트 객체인지 확인해서 맞다면
			Student student = (Student) obj;//다운캐스팅 instanceof와 세트! 암기하기
			return (sno == student.sno) && (name==student.name);
		} else {
			return false;
		}
	}
	//hashCode의 주소를 sno와 name으로 사용하도록 구
	public int hashCode() {
		return sno + name.hashCode();
		//hash코드는 같은 값을 입력했을 때 중복된 값을 생성하지 않도록 막아주기 위해 사용!
	}
}
