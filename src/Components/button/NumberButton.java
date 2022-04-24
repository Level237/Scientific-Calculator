package Components.button;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class NumberButton extends JButton{

	public NumberButton(String number) {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(40,30));
		this.setText(number);
		this.setForeground(Color.white);
	}

}
