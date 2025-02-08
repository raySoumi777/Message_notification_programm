package message;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
public class SendMessage extends NotificationPart{
	public SendMessage() {
		super();
		setTitle("Send Message");
		// TODO Auto-generated constructor stub
		 sendNotification("Enter phone number");
		 notificationBody("Enter text message to send") ;
		setVisible(true);
		super.send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SendMessageNotification().Notify("you",textArea.getText(),field.getText());
			}
			
		});
	}
	

	@Override
	public void sendNotification(String Name) {
		// TODO Auto-generated method stub
		sendArea=new Label(Name);
		field.setName(Name);
		header.add(send,BoxLayout.X_AXIS);
		header.add(field,BoxLayout.X_AXIS);
		header.add(sendArea,BoxLayout.X_AXIS);
		}

	

	@Override
	public void notificationBody(String TypeOfMsg) {
		// TODO Auto-generated method stub
		super.notificationBody(TypeOfMsg);
	}

}
