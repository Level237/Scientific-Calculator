package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.Label.ScreenLabel;
import Components.Label.TimeLabel;
import Components.Panel.*;
import Components.button.List.GroupButton;
import Layouts.Grid.GridLayoutForNumber;

public class Calculator extends JFrame{
	
	private JPanel container;
	private ScreenLabel screenLabel;
	private ScreenPanel screenPanel;
	private TimePanel timePanel;
	private TimeLabel timeLabel;
	private NumberPanel numberPanel;
	private OperatorPanel operatorPanel;
	private FonctionPanel functionPanel;
	private GroupButton groupButton;
	private GridLayoutForNumber gridNumber;
	private GridLayoutForNumber gridNumber1;
	private GridLayoutForNumber gridNumber2;
	
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
		this.initFunctionComponent();
		this.initNumberComponent();
		this.initOperatorComponent();
		
		
		this.initComponentGroupButton();
		
		
	}
	
	void initNumberComponent() {
		this.numberPanel=new NumberPanel();
		GridLayout g1 = new GridLayout(4, 3);
		g1.setHgap(5);
		g1.setVgap(5);
		numberPanel.setLayout(g1);
		this.numberPanel.setBackground(Color.DARK_GRAY);
		this.container.add(numberPanel,BorderLayout.CENTER);
		
	}
	void initOperatorComponent(){
		this.operatorPanel=new OperatorPanel();
		this.operatorPanel.setPreferredSize(new Dimension(100, 200));
		GridLayout g2 = new GridLayout(3, 2);
		g2.setHgap(5);
		g2.setVgap(5);
		this.operatorPanel.setLayout(g2);
		this.operatorPanel.setBackground(Color.DARK_GRAY);
		this.container.add(operatorPanel,BorderLayout.EAST);
		
	}
	
	void initFunctionComponent() {
		this.functionPanel=new FonctionPanel();
		GridLayout g3 = new GridLayout(3, 3);
		this.functionPanel.setLayout(g3);
		this.container.add(functionPanel);
	}
	
	void initComponentGroupButton() {
		this.groupButton=new GroupButton(this.numberPanel,this.operatorPanel,this.functionPanel,this.screenLabel);
		
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
