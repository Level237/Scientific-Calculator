package Listener.components.button;

import Components.Label.ScreenLabel;

public class OperatorArithmetic extends ListenerButtonImplement{

	String Operator;
	ScreenLabel screen;
	public OperatorArithmetic(String OperatorType,ScreenLabel screen) {
		// TODO Auto-generated constructor stub
		this.Operator=OperatorType;
		this.screen=screen;
		this.calculate(this.Operator);
	}
	
	void calculate(String Operator) {
		int i=0;
		if(this.Operator.equals("+")) {
			this.result = this.number +
					Double.valueOf(this.screen.getText()).doubleValue();
		}
		else {
			this.screen.setText(String.valueOf(this.result));
			this.isNumber=true;
		}
	}
	void setOperator(String Operator) {
		this.Operator=Operator;
	}
}


