package Listener.components.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Components.Label.ScreenLabel;

public class ArithmeticListener extends ListenerButtonImplement{
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
	
	public ArithmeticListener(ScreenLabel screen) {
		// TODO Auto-generated constructor stub
		this.screen=screen;
	}
	
	
			public class NumberListener implements ActionListener{
		
		
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
			
				public class AdditionListener implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				}
	}


	
	
 
