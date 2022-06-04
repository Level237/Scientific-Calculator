package Components.button.List;

import Components.Label.ScreenLabel;
import Components.Panel.*;
import Components.button.NumberButton;
import Layouts.Grid.GridLayoutForNumber;
import Listener.components.button.AdditionListener;


import Listener.components.button.OperatorArithmetic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GroupButton{

	
	private String[] symbol={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "/", "=", "-.", "+", "-", "x", "Pi",
			"Cos", "Sin", "Tan", "Ln", "exp", "off", "e", "racine","C"};
	private NumberButton[] groupButton=new NumberButton[symbol.length];
	private NumberPanel numberPanel=new NumberPanel();
	private OperatorPanel operatorPanel= new OperatorPanel();
	private FonctionPanel functionPanel= new FonctionPanel();
	private ScreenLabel screen;
	 private boolean isUpdate = false;
	 private boolean isUpdate1;
	 boolean isUpdate2=false;
	 boolean isclickOnOperator=false;
	 boolean isNumber=false;
	 boolean isclickOnSubstract=false;
	 boolean isclickOnExponential=false;
	 boolean isclickOnExponent=false;
	 boolean isclickOnAddition=false;
	 boolean isclickOnConsinus=false;
	 boolean isclickOnSinus=false;
	 boolean isclickOntangente=false;
	 boolean isclickOnLog=false;
	 boolean isclickOnDash=false;
	 double result=0;
	 double number=0;
	 String Operator="";
	
	public GroupButton(NumberPanel numberPanel,OperatorPanel operatorpanel,FonctionPanel functionPanel,ScreenLabel screen) {
		// TODO Auto-generated constructor stub
		this.screen=screen;
		this.numberPanel= numberPanel;
		this.operatorPanel= operatorpanel;
		this.functionPanel= functionPanel;
		this.initGroupButton();
		
		
	}
	

	
	void initGroupButton() {
		for(int i=0;i<groupButton.length;i++) {
			listButton(i);
			
			
			
		}
		
	}
	void listButton(int i) {
		
		groupButton[i]=new NumberButton(symbol[i]);
	
		
		switch (i) {
		case 10:
			
			numberPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			break;
		case 11:
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));

			break;
		case 12:
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			this.groupButton[i].addActionListener(new EqualListener());
			break;
			
		case 13:
			
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			groupButton[i].setForeground(Color.white);
			groupButton[i].setBackground(Color.black);
			groupButton[i].addActionListener(new PutSubstractListener());
			break;
		case 14:

			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			groupButton[i].addActionListener(new AdditionListener());
			break;
		case 15:
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			groupButton[i].addActionListener(new SubstractListener());
			break;
		case 16:
	
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			break;
		case 17:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			break;
		case 18:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
		
			break;
		case 19:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
		
			break;
		case 20:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
		
			break;
		case 21:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			
			break;
		case 22:
		
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(90, 30));
			
			break;
		case 23:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			
			break;
		case 24:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			
			break;
		case 25:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			
			break;
		case 26:
			
			
			groupButton[i].setForeground(Color.red);
			this.numberPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			break;
		default:
			this.numberPanel.add(groupButton[i]);
			groupButton[i].addActionListener(new NumberListener());
			break;
		}
	}
	
	void calculate() {
		int i=0;
		if(this.Operator.equals("+")) {
			this.result = this.number +
					Double.valueOf(this.screen.getText()).doubleValue();
			i=(int)result;
			if((String.valueOf(result)).contains(".0")) {
				i=(int)result;
								
								this.screen.setText(String.valueOf(i));
								this.isNumber=true;
							}
							else {
								this.screen.setText(String.valueOf(result));
								this.isNumber=true;
							}
							if((this.screen.getText().contains("Na"))) {
								this.screen.setText("Bad Syntaxe");
							}
		}
		if (this.Operator.equals("-")) {
					
					result = this.number -
							Double.valueOf(this.screen.getText()).doubleValue();
					
					if((String.valueOf(result)).contains(".0")) {
		i=(int)result;
						
						this.screen.setText(String.valueOf(i));
						this.isNumber=true;
					}
					else {
						this.screen.setText(String.valueOf(result));
						this.isNumber=true;
					}
					if((this.screen.getText().contains("Na"))) {
						this.screen.setText("Bad Syntaxe");
					}
				}
		
		if (Operator.equals("x")) {
			result = this.number*
					Double.valueOf(this.screen.getText()).doubleValue();
			if((String.valueOf(result)).contains(".0")) {
i=(int)result;
				
				this.screen.setText(String.valueOf(i));
				this.isNumber=true;
			}
			else {
				this.screen.setText(String.valueOf(result));
				this.isNumber=true;
			}
			if((this.screen.getText().contains("Na"))) {
				this.screen.setText("Bad Syntaxe");
			}
		}
		
		if (Operator.equals("/")) {
			result = this.number
 / Double.valueOf(this.screen.getText()).doubleValue();
		
		if((String.valueOf(result)).contains(".0")) {
        i=(int)result;

				
				this.screen.setText(String.valueOf(i));
				
				this.isNumber=true;
			}
			else {
				this.screen.setText(String.valueOf(result));
				this.isNumber=true;
			}
		if((this.screen.getText().contains("Na"))) {
			this.screen.setText("Bad Syntaxe");
		}
			try {
				if(result==this.number/0) {
					this.screen.setForeground(Color.red);
					this.screen.setText("SYNTAX ERROR");
				}
				
			} catch (ArithmeticException e) {
				
			}
		}
	}
	
	
	class NumberListener implements ActionListener{
		
		
		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String screenListener=((JButton) e.getSource()).getText();
				screen.setForeground(Color.black);
				
				if(isUpdate) {
					isUpdate=false;
				}
				else {
					if (! screen.getText().equals("0") && (!screen.getText().equals("SYNTAX ERROR")) ) {
						screenListener = screen.getText() + screenListener;
						
				}
					
				}
				screen.setText(screenListener);
				System.out.println(isUpdate1);
				if(isUpdate1==true) {
					screen.setText(screenListener);
					isUpdate2=true;
				}
			    	isclickOnDash=true;
			
				}
		}
	 class AdditionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(isclickOnOperator) {
				screen.setText(String.valueOf(result));
			}
			else {
				number=Double.valueOf(screen.getText()).doubleValue();
			}
			
			Operator="+";
			
			isUpdate=true;
			isUpdate1=true;
			System.out.println(isUpdate1);
			isUpdate2=true;
			isNumber=false;
			isclickOnDash=false;
		}
		
	}
	
	 class EqualListener implements ActionListener{
		 @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 System.out.println(isNumber);
				if(isNumber==false) {
					
					calculate();
					isclickOnExponent=true;
					  isUpdate=true;
						isUpdate1 = true;
					isclickOnOperator = false;
					
				}
				isclickOnDash=false;
				
			}
	 }
	 class PutSubstractListener implements ActionListener{
		 @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str="-";
					System.out.println(isclickOnSubstract);
					if(isclickOnSubstract==true) {
						screen.setText(str+screen.getText());
					}
				if(screen.getText().contains("-")) {
					screen.setText(screen.getText().replace("-",""));
				
				}
				else {
					screen.setText(str+screen.getText());
				}
				
				
				
			}
	 }
	 class SubstractListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str=((JButton)e.getSource()).getText();
			
			if(isclickOnOperator) {
							
							screen.setText(String.valueOf(number));
						}
						else {
							number=Double.valueOf(screen.getText()).doubleValue();
							
				}
			isclickOnSubstract=true;
			Operator="-";
			isUpdate=true;
			isUpdate1=true;
			isNumber=false;
			isclickOnDash=false;
		}
		 
	 }
	 class MultiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				if(isclickOnOperator) {
					screen.setText(String.valueOf(result));
				}
				else {
					number=Double.valueOf(screen.getText()).doubleValue();
					
				}
				Operator="x";
				isUpdate=true;
				isUpdate1=true;
				isNumber=false;
				isclickOnDash=false;
		}
		 
	 }
}
