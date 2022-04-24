package Label;

import java.awt.Font;

import javax.swing.JLabel;

public class ScreenLabel extends JLabel {
	
	private Font police;
	public ScreenLabel() {
		// TODO Auto-generated constructor stub
		this.setText("0");
		this.initPolice();
		
	}
	public void initPolice() {
		police=new Font("Arial black", Font.BOLD, 20);
	}

}
