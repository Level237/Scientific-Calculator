package Windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.Label.ScreenLabel;
import Components.Label.TimeLabel;
import Components.Panel.ScreenPanel;
import Components.Panel.TimePanel;

public class Calculator extends JFrame{
	
	private JPanel container;
	private ScreenLabel screenLabel;
	private ScreenPanel screenPanel;
	private TimePanel timePanel;
	private TimeLabel timeLabel;
	
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
		
		// construct component screer
		screenLabel=new ScreenLabel();
		screenPanel=new ScreenPanel();
		this.initScreenInAComponent();
		
		//construct component time
		timeLabel=new TimeLabel();
		timePanel=new TimePanel();
		
	}
	
	// init Screen Component
	void initScreenInAComponent() {
		screenPanel.add(screenLabel);
		this.insertScreenComponentInTheContainer();
	}
	
	void insertScreenComponentInTheContainer() {
		this.container.add(screenPanel,BorderLayout.NORTH);
	}
	// init Time Component
	
	void initTimeInAComponent() {
		timePanel.add(timeLabel);
		
	}
	
	void BackgroundColorInTheContainer() {
		this.container.setBackground(Color.DARK_GRAY);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
	}

}
