package Components.Panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class TimePanel extends JPanel{

	public TimePanel() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(90,45));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setAlignmentX(RIGHT_ALIGNMENT);
	}

}
