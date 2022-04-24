package Windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.Label.ScreenLabel;
import Components.Panel.ScreenPanel;

public class Calculator extends JFrame{
	
	private JPanel container;
	private ScreenLabel screenLabel;
	private ScreenPanel screenPanel;
	
	public Calculator() {
		this.setTitle("Calculator");
		this.setSize(300,440);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.initComponent();
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	void initComponent(){
		container=new JPanel();
		this.BackgroundColorInTheContainer();
		screenLabel=new ScreenLabel();
		screenPanel=new ScreenPanel();
		this.initScreenInAComponent();
	}
	
	// init Screen
	void initScreenInAComponent() {
		screenPanel.add(screenLabel);
		this.insertScreenComponentInTheContainer();
	}
	
	void insertScreenComponentInTheContainer() {
		this.container.add(screenPanel,BorderLayout.NORTH);
	}
	
	void BackgroundColorInTheContainer() {
		this.container.setBackground(Color.DARK_GRAY);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
	}

}
