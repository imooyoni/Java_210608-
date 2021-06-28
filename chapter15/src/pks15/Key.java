package pks15;

public class Key {
	
	public int number;
	
	public Key(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}

	
	//논리적으로 값이 같은지 확인하는 과정
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number)
				return true;
		}
		
		return false;
	}

	//물리적으로 값이 같은지 확인하는 과정
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}

}
