package collection.stack_queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//coinBox.push(1000); >> int형을 입력한 것과 같다
		coinBox.push(new Coin(810)); //>>Coin type을 입력한 것과 같다
		coinBox.push(new Coin(10000));
		coinBox.push(new Coin(5000));
		coinBox.push(new Coin(2000));
		coinBox.push(new Coin(1000));
		
		while(!coinBox.isEmpty()) {//코인박스가 비어있지 않으면 멈춰!
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());
			
		}
	}

}
