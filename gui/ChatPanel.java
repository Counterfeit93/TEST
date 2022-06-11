package projekt.zaliczenie.application.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatPanel {
	
	private JPanel panel = new JPanel(null);
	private JButton []button;
	private CardLayout cL;
	private Container panelCont;
	private JTextField[] textfield;
	static JLabel [] label;
	static Textfield nTextfield = new Textfield();
	static Label nLabel = new Label();

	public ChatPanel(CardLayout cl,Container cont,Button obj)
	{
		cL=cl;
		panelCont=cont;
		addPanel(obj,new ChatListener());
	}
	
	void addPanel(Button obj,ChatListener listener)
	{	
		panel.setBackground(Color.WHITE);
		String [] loginButtons = userList(testList());
		button=obj.describeButton(panel,loginButtons, listener, 0, 0, 0, 80);
		textfield=nTextfield.describeTextfield(panel,1,400,460,860);
		int size = sizeOfList(testList());
		System.out.println(size);
		button[size-1].setBounds(860,590,400,80);
		button[size-2].setBounds(400,590,400,80);
		//panel.add(button[size-1]);
		//button[size-1].addActionListener(listener);
		//button[size-1].setBounds(0,0,400,80);
		//textfield[0].replaceSelection("Login");
		//textfield[1].replaceSelection("Hasło");
		panelCont.add(panel,"ChatPanel");	
	}
	
	String [] userList(List<String> list)
	{
		String [] users = new String[list.size()];
		return list.toArray(users);		
	}
	
	public class ChatListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==button[0])
			{	
				//System.exit(0);
			}
			if(e.getSource()==button[1])
			{
				//System.exit(0);
			}
			if(e.getSource()==button[3])
			{
				System.exit(0);
			}
			if(e.getSource()==button[4])
			{
				System.exit(0);
			}

		}
	
	}
	
	int sizeOfList(List <String> list)
	{
		return list.size();
	}
	
	List <String> testList()
	{
		List <String> list = new ArrayList<>();
		list.add("jeden");
		list.add("dwa");
		list.add("trzy");
		list.add("wyjście");
		list.add("wyslij");
		return list;
		
	}
	
}
