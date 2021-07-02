package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>(); //Queue는 LinkedList
		//offer 입력
		messageQueue.offer(new Message("sendMail","이호진"));
		messageQueue.offer(new Message("sendSMS","김지영"));
		messageQueue.offer(new Message("sendKakaotalk","홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "에게 메일을 보냈습니다.");
				break;
				
			case "sendSMS":
				System.out.println(message.to + "에게 문자를을 보냈습니다.");
				break;
				
			case "sendKakaotalk":
				System.out.println(message.to + "에게 카톡을 보냈습니다.");
				break;
			}
		}
	}

}
