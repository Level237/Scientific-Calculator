package Listener.components.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Components.Label.ScreenLabel;

public class EqualListener  extends ListenerButtonImplement implements ActionListener{
	
	private ScreenLabel screen;
	private OperatorArithmetic operator;
	public EqualListener() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.isNumber) {
			operator.calculate("=");
			this.isclickOnExponent=true;
			  this.isUpdate=true;
				this.isUpdate1 = true;
			this.isclickOnOperator = false;
		}
		this.isclickOnDash=false;
		
	}

}