package Windows;

import javax.swing.JFrame;

public class Calculator extends JFrame{
	
	public Calculator() {
		this.setTitle("Calculator");
		this.setSize(300,440);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
