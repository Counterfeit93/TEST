package projekt.zaliczenie.application.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel 
{
	private JPanel panel = new JPanel(null);
	private JButton []button;
	private CardLayout cL;
	private Container panelCont;
	private JTextField[] textfield;
	static JLabel [] label;
	static Textfield nTextfield = new Textfield();
	static Label nLabel = new Label();
	
	public LoginPanel(CardLayout cl,Container cont,Button obj)
	{
		cL=cl;
		panelCont=cont;
		addPanel(obj,new LoginListener());
	}
	
	void addPanel(Button obj,LoginListener listener)
	{	
		panel.setBackground(Color.WHITE);
		String [] loginButtons = {"Zaloguj","Wyjście"};
		button=obj.describeButton(panel,loginButtons, listener, 430, 350, 0, 120);
		textfield=nTextfield.describeTextfield(panel,2,430,100,400);
		panelCont.add(panel,"LoginPanel");	
	}
	
	
	public class LoginListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==button[0])
			{	
				cL.show(panelCont,"ChatPanel");
			}
			if(e.getSource()==button[1])
			{
				System.exit(0);
			}

		}
	
	}
}
