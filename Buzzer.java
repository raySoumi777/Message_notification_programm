package message;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buzzer extends NotificationPart {
	public Buzzer() {
		// TODO Auto-generated constructor stub
		super();
		setTitle("Buzzer");
		// TODO Auto-generated constructor stub
		 Button SoundButton=new Button("Generate Sound");
		 add(SoundButton,BorderLayout.CENTER);
		 SoundButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new SendBuzzerNotification().Notify("null","null","null");
				}
				
			});
		}
		
	}
	

	


