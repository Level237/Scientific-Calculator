package Windows;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.Label.ScreenLabel;

public class Calculator extends JFrame{
	
	private JPanel container;
	private ScreenLabel ScreenLabel;
	
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
		Calculator c=new Calculator();
	}

}
