package message;


public class SendMessageNotification implements Notification {

	@Override
	public void Notify(String Sender, String msg, String Reciever) {
		// TODO Auto-generated method stub
		System.out.println("Message : "+msg+" is sent to "+Reciever+" from "+Sender);
	}

	
}
