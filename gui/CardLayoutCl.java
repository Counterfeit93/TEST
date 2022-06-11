package projekt.zaliczenie.application.gui;

import java.awt.CardLayout;
import java.awt.Container;

public class CardLayoutCl {
	
	CardLayout cL = new CardLayout();
	Frame frame = new Frame();
	private Container panelCont;
	
	public CardLayoutCl()
	{
		frame.describeFrame();
		panelCont = frame.frame.getContentPane();
		panelCont.setLayout(cL);
		new LoginPanel(cL,panelCont,new Button());
		new ChatPanel(cL,panelCont,new Button());
		//new AddPanel(cL,panelCont,new Button());
		cL.show(panelCont,"LoginPanel");
	}

}
