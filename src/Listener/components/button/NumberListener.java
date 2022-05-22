package Listener.components.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Components.Label.ScreenLabel;
import Components.button.NumberButton;

public class NumberListener extends ListenerButtonImplement implements ActionListener {
	
	private ScreenLabel screen;
	
	public NumberListener(ScreenLabel screen) {
		this.screen=screen;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String screenListener=((JButton) e.getSource()).getText();
			this.screen.setForeground(Color.black);
			this.screen.setText(screenListener);
			
			if(this.isUpdate) {
				this.isUpdate=false;
			}
			else {
				
			}
			
	}

}
