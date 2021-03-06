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
			this.groupButton[i].addActionListener(new CommaListener());
			break;
		case 11:
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			this.groupButton[i].addActionListener(new DivListener());
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
			groupButton[i].addActionListener(new MultiListener());
			break;
		case 17:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			groupButton[i].addActionListener(new PiListener());
			
			break;
		case 18:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			groupButton[i].addActionListener(new CosListener());
			
			break;
		case 19:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			groupButton[i].addActionListener(new SinusListener());
			
		
			break;
		case 20:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			groupButton[i].addActionListener(new TanListener());
			break;
		case 21:
			
			functionPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			groupButton[i].addActionListener(new LogListener());
			break;
		case 22:
			groupButton[i].addActionListener(new ExposantListener());
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
			groupButton[i].addActionListener(new RacineListener());
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
		if(isclickOnExponent==true && isUpdate==true && isUpdate1==true ) {
			
			result=Math.pow(number, Double.valueOf(screen.getText()).doubleValue());
			if((String.valueOf(result)).contains(".0")) {
				i=(int)result;
								
								screen.setText(String.valueOf(i));
								isclickOnExponent=true;
								isUpdate=false;
								isUpdate1=false;
								isNumber=true;
							}
							else {
								screen.setText(String.valueOf(result));
								isclickOnExponent=true;
								isUpdate=false;
								isUpdate1=false;
								isNumber=true;
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
				isclickOnSubstract=true;
			
				}
		}
	 class AdditionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(isclickOnOperator);
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
	 class DivListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(isclickOnOperator) {
					
					screen.setText(String.valueOf(result));
				}
				else {
					number=Double.valueOf(screen.getText()).doubleValue();
				}
				Operator="/";
				isUpdate=true;
				isUpdate1=true;
				isNumber=false;
			}
			
		}
	 
	 class CommaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str=".";
			if(isclickOnDash==false && isUpdate==false) {
				screen.setText(screen.getText()+str);
				isclickOnDash=true;
				
				
			}
		}
		 
	 }
	 class PiListener implements ActionListener{
		    

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				screen.setText(String.valueOf(Math.PI));
			}
	    	
	    }
	 class CosListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=((JButton)e.getSource()).getText();
				int i=0;
				result=Math.cos(Double.valueOf(screen.getText()));
				if((String.valueOf(result)).contains(".0")) {
					i=(int)result;
									
									screen.setText(String.valueOf(i));
									isUpdate=true;
								}
								else {
									screen.setText(String.valueOf(result));
									isUpdate=true;
								}
				}
				
			}
	 class SinusListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				int i=0;
				result=Math.sin(Double.valueOf(screen.getText()));
				if((String.valueOf(result)).contains(".0")) {
					i=(int)result;
									
									screen.setText(String.valueOf(i));
									isUpdate=true;
								}
								else {
									screen.setText(String.valueOf(result));
									isUpdate=true;
								}	
				if((String.valueOf(result)).contains("-Inf")) {
					screen.setForeground(Color.red);
					screen.setText(String.valueOf("SYNTAX ERROR"));
					
	                
	}
			}
 		
 	}
	 class TanListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				int i=0;
				result=Math.tan(Double.valueOf(screen.getText()));
				if((String.valueOf(result)).contains(".0")) {
					i=(int)result;
									
									screen.setText(String.valueOf(i));
									isUpdate=true;
								}
								else {
									screen.setText(String.valueOf(result));
									isUpdate=true;
								}	
				if((String.valueOf(result)).contains("-Inf")) {
					screen.setForeground(Color.red);
					screen.setText(String.valueOf("SYNTAX ERROR"));
					
	                
	}
			}
	    	
	    }
	 class LogListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
					int i=0;
					result=Math.log(Double.valueOf(screen.getText()));
					if((String.valueOf(result)).contains(".0")) {
						i=(int)result;
										
										screen.setText(String.valueOf(i));
										isUpdate=true;
									}
									else {
										screen.setText(String.valueOf(result));
										isUpdate=true;
									}	
					if((String.valueOf(result)).contains("-Inf")) {
						screen.setForeground(Color.red);
						screen.setText(String.valueOf("SYNTAX ERROR"));
						
		                
		}}
			}
	 class RacineListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int i=0;
				result=Math.sqrt(Double.valueOf(screen.getText()));
				if((String.valueOf(result)).contains(".0")) {
					i=(int)result;
									
									screen.setText(String.valueOf(i));
									isUpdate=true;
								}
								else {
									screen.setText(String.valueOf(result));
									isUpdate=true;
								}	
				if((String.valueOf(result)).contains("Na")) {
					screen.setForeground(Color.red);
					screen.setText(String.valueOf("SYNTAX ERROR"));
					
	                
	}
			}
	    	
	    }
	 class ExposantListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(isclickOnOperator) {
					screen.setText(String.valueOf(result));
				}
				else {
					number=Double.valueOf(screen.getText()).doubleValue();
				}
				
				isclickOnExponent=false;
				isUpdate=true;
				isNumber=false;
				
			}
			   
		   }

}
