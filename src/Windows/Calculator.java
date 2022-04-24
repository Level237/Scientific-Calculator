package Windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.Label.ScreenLabel;
import Components.Label.TimeLabel;
import Components.Panel.*;
import Components.button.List.GroupButton;

public class Calculator extends JFrame{
	
	private JPanel container;
	private ScreenLabel screenLabel;
	private ScreenPanel screenPanel;
	private TimePanel timePanel;
	private TimeLabel timeLabel;
	private NumberPanel numberPanel;
	private OperatorPanel operatorPanel;
	private FonctionPanel functionPanel;
	private GroupButton grouButton;
	
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
		this.initTimeInAComponent();
		
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
		this.insertTimeComponentInTheContainer();
	}
	
	void insertTimeComponentInTheContainer() {
		this.container.add(timePanel,BorderLayout.NORTH);
	}
	
	
	
	void BackgroundColorInTheContainer() {
		this.container.setBackground(Color.DARK_GRAY);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
	}

}
