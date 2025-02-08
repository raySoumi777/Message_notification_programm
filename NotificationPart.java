package message;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;

import message.NotificationGui.MyWindowAdapter;
public class NotificationPart extends Frame  implements Notification_body {
	public Panel header;
	public Label sendArea;
	public TextArea textArea;
	public TextField field;
	public Button send;
	public Panel header1;
	public JComboBox c1;
	public static   String item;
	public NotificationPart(){
		setSize(400,400);
		setLayout(new BorderLayout());
		header=new Panel();
		field=new TextField();
		field.setSize(300, 10);
		add(header,BorderLayout.NORTH);
		send=new Button("Send");
	       setVisible(true);
		addWindowListener(new MyWindowAdapter());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NotificationPart();
		

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
		textArea=new TextArea( TypeOfMsg);
		add(textArea,BorderLayout.CENTER);
	}
	class MyWindowAdapter extends WindowAdapter{
		public void winodwClosing(WindowEvent we) {
			System.exit(0);
		}
	}

}
