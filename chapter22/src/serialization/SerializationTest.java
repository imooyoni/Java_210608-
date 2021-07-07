package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	private static final long serialVersionUID = -3250194140145292632L; //객체가 저장되게 하는 보안 인증키라고 생각하면 됨!
	
	String name;
	//transient : 직렬화에서 제외시키는 것!
	transient String job;
	
	public Person(){
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + ", " + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//Has a 방법 사
		Person personHong = new Person("홍길동", "대표이사");
		Person personKang = new Person("강동원", "바지사장");
		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personHong);
			oos.writeObject(personKang);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject(); //person타입 p1인스턴스 읽어올거야! 근데 ois는 object타입이라 다운캐스팅 해야해!
			Person p2 = (Person)ois.readObject(); //person타입 p1인스턴스 읽어올거야! 근데 ois는 object타입이라 다운캐스팅 해야해!
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
