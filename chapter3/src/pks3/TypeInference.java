package pks3;
//�ڹ� version 10�̻���� �����, ��������� �ƴ�!
public class TypeInference {

	public static void main(String[] args) {
	
		int i=10;
		var j=10.0;// var�� dluble�� ������ �Ͱ� ����
		var str="hello"; // var�� String���� ������ �Ͱ� ����
		
		i=100;
		str="test";
		j=10.5;
				
		//str=3; Type Error 
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		

	}

}
