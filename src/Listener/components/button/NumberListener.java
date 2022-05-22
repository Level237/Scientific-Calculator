package Listener.components.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Components.Label.ScreenLabel;
import Components.button.NumberButton;

public class NumberListener implements ActionListener{
	
	private ScreenLabel screen;
	private NumberButton button;
	
	public NumberListener(ScreenLabel screen,NumberButton button) {
		this.screen=screen;
		this.button=button;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String
			this.screen.setForeground(Color.black);
	}

}
