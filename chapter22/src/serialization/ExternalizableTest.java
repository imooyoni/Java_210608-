package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	
	String name;
	
	public Dog() {
	}//기본생성자
	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {//코드에서 직접 호출하지 않아도 objectstream을 사용하는 경우 찾아 올라와서 불러옴!
		// TODO Auto-generated method stub
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = in.readUTF();
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Dog sichu = new Dog();
		
		sichu.name = "메리";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try (fos; oos){
			oos.writeObject(sichu);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		
		System.out.println(dog);

	}

}

/*
 자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 
 사용할 수 있도록 바이트(byte) 형태로 데이터 변환하는 기술과 바이트로 변환된 데이터를 
 다시 객체로 변환하는 기술(역직렬화)을 아울러서 이야기합니다.
시스템적으로 이야기하자면 JVM(Java Virtual Machine 이하 JVM)의 
메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술과 
직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 같이 이야기합니다.
*/