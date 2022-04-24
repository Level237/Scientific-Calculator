package Components.button.List;

import Components.Panel.*;
import Components.button.NumberButton;

import java.awt.Color;
import java.awt.Dimension;

public class GroupButton{

	
	private String[] symbol={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "/", "=", "-.", "+", "-", "x", "Pi",
			"Cos", "Sin", "Tan", "Ln", "exp", "off", "e", "racine","C"};
	private NumberButton[] groupButton=new NumberButton[symbol.length];
	private NumberPanel numberPanel=new NumberPanel();
	private OperatorPanel operatorPanel= new OperatorPanel();
	private FonctionPanel functionPanel= new FonctionPanel();
		
	public GroupButton(NumberPanel numberPanel,OperatorPanel operatorpanel,FonctionPanel functionPanel) {
		// TODO Auto-generated constructor stub
		this.numberPanel= numberPanel;
		this.operatorPanel= operatorpanel;
		this.functionPanel= functionPanel;
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

			break;
			
		case 13:
			
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			groupButton[i].setForeground(Color.white);
			groupButton[i].setBackground(Color.black);

			break;
		case 14:

			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
			break;
		case 15:
			operatorPanel.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));
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
			groupButton[i].setPreferredSize(new Dimension(40, 30));
			
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
			
			break;
		}
	}

}
