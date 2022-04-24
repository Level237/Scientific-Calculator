package Components.button.List;

import Components.Panel.NumberPanel;
import Components.button.NumberButton;
import java.awt.Dimension;

public class GroupButton{

	
	private String[] symbol={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "/", "=", "-.", "+", "-", "x", "Pi",
			"Cos", "Sin", "Tan", "Ln", "exp", "off", "e", "racine","C"};
	private NumberButton[] groupButton=new NumberButton[symbol.length];
	private NumberPanel numberPanel;
	
	public GroupButton() {
		// TODO Auto-generated constructor stub
		this.numberPanel=new NumberPanel();
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
			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(new Dimension(60, 31));

			break;
		case 12:
			groupButton[i].addActionListener(new EgalListener());
			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);

			break;
			
		case 13:
			groupButton[i].addActionListener(new Moins1Listener());
			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);
			groupButton[i].setForeground(Color.white);
			groupButton[i].setBackground(Color.black);

			break;
		case 14:

			groupButton[i].addActionListener(new PlusListener());

			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);
			break;
		case 15:
			groupButton[i].addActionListener(new MoinsListener());
			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);
			break;
		case 16:
			groupButton[i].addActionListener(new MultiListener());
			operateur.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);
			break;
		case 17:
			groupButton[i].addActionListener(new PiListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);

			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 18:
			groupButton[i].addActionListener(new CosListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 19:
			groupButton[i].addActionListener(new SinusListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 20:
			groupButton[i].addActionListener(new TanListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 21:
			groupButton[i].addActionListener(new LogListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 22:
			groupButton[i].addActionListener(new ExposantListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 23:
			groupButton[i].addActionListener(new OffListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.red);
			groupButton[i].setForeground(Color.white);
			break;
		case 24:
			groupButton[i].addActionListener(new ExponentielListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 25:
			groupButton[i].addActionListener(new RacineListener());
			fonction.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim3);
			groupButton[i].setBackground(Color.white);
			groupButton[i].setForeground(Color.black);
			break;
		case 26:
			
			groupButton[i].addActionListener(new ResetListener());
			groupButton[i].setForeground(Color.red);
			chiffre.add(groupButton[i]);
			groupButton[i].setPreferredSize(dim2);
			break;
		default:
			chiffre.add(groupButton[i]);
			groupButton[i].addActionListener(new chiffreListener());
			break;
		}
	}

}
