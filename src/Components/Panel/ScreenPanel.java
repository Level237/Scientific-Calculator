package Components.Panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ScreenPanel extends JPanel{

	public ScreenPanel() {
		
		this.setPreferredSize(new Dimension(280,40));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
}
