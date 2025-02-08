package message;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;

public class NotificationGui extends NotificationPart{
	public Panel header1;
	public JComboBox c1;
	public static   String item;
	public NotificationGui() {
		super();
		String s1[] = { "Send Message", "Send email", "Sound Buzzer" };
		 
        // create checkbox
        c1 = new JComboBox(s1);
        
       header1=new Panel();
      
        sendNotification("Enter");
        header.add(c1,BoxLayout.X_AXIS);
        notificationBody("Notofication body");
      
      
       super.send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				item=(String)c1.getSelectedItem();
				if(item.equalsIgnoreCase("Send email")) {
					new SendEmail();
				}
				else if(item.equalsIgnoreCase("send message")) {
					new SendMessage();
				}
				else {
					new Buzzer();
				}
			}
			
		});
       setVisible(true);
       addWindowListener(new MyWindowAdapter());
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NotificationGui();
		

	}
	class MyWindowAdapter extends WindowAdapter{
		public void winodwClosing(WindowEvent we) {
			System.exit(0);
		}
	}

}
