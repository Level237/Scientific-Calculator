package Label;

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
		
	}
	public void initPolice() {
		font=new Font("Arial black", Font.BOLD, 20);
	}

}
