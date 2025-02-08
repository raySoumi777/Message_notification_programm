package message;

public class SendEmailNotification implements Notification {

	@Override
	public void Notify(String Sender, String msg, String Reciever) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		new Email().sendEmail(msg, Reciever);

	}
	

}
