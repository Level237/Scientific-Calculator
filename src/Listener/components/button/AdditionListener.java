package Listener.components.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Components.Label.ScreenLabel;

public class AdditionListener extends ListenerButtonImplement implements ActionListener{
	private ScreenLabel screen;
	private OperatorArithmetic operator;
	public AdditionListener(ScreenLabel screen	) {
		// TODO Auto-generated constructor stub
		this.screen=screen;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.isclickOnOperator) {
			this.screen.setText(String.valueOf(this.result));
		}
		else {
			this.number=Double.valueOf(this.screen.getText()).doubleValue();
		}
		
		operator.setOperator("+");
		this.isUpdate=true;
		this.isUpdate1=true;
		this.isUpdate2=true;
		this.isNumber=true;
		this.isclickOnDash=true;
	}

}
