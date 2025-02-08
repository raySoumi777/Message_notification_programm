package message;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendEmail extends NotificationPart {

	public SendEmail() {
		// TODO Auto-generated constructor stub
		super();
		setTitle("Send Email");
		// TODO Auto-generated constructor stub
		 sendNotification("Enter Email-id");
		 notificationBody("Enter Mail") ;
		 super.send.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new SendEmailNotification().Notify("you",textArea.getText(),field.getText());
				}
				
			});
		}
		
	
	
	@Override
	public void sendNotification(String Name) {
		// TODO Auto-generated method stub
		super.sendNotification(Name);
	}

	@Override
	public void notificationBody(String TypeOfMsg) {
		// TODO Auto-generated method stub
		super.notificationBody(TypeOfMsg);
	}

}
