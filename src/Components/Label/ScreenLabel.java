package Components.Label;


import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class ScreenLabel extends JLabel {
	
	private Font font;
	public ScreenLabel() {
		// TODO Auto-generated constructor stub
		this.setText("0");
		this.initPolice();
		this.setFont(font);
		this.setHorizontalAlignment(JLabel.RIGHT);
		this.setPreferredSize(new Dimension(280,45));
		
	}
	public void initPolice() {
		font=new Font("Arial black", Font.BOLD, 20);
	}

}

