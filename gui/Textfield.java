package projekt.zaliczenie.application.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Textfield {
	
private Font font = new Font("AvantGarde",Font.BOLD,20);
	
	JTextField [] describeTextfield(JPanel panel, int numberOfTextfields,int baseXpos, int baseYpos, int size)
	{
		JTextField [] textfield = new JTextField[numberOfTextfields];
		for (int i=0;i<textfield.length;i++)
		{	
			textfield[i] = new JTextField();
			textfield[i].setFont(font);
			textfield[i].setBackground(Color.WHITE);
			textfield[i].setEditable(true);
			textfield[i].setHorizontalAlignment(JTextField.CENTER);
			panel.add(textfield[i]);		
		}
		addTextfield(textfield,baseXpos,baseYpos,size);
		return textfield;
	}
	
	void addTextfield(JTextField [] textfield,int baseXpos, int baseYpos, int size)
	{
		for (int i=0;i<textfield.length;i++)
		{
				textfield[i].setBounds(baseXpos, baseYpos , size, 60);
				baseYpos +=100;
		}

	}
	
	void clearTextfield(JTextField [] textfield)
	{
		for (int i=0;i<7;i++)
		{
			textfield[i].setBackground(Color.WHITE);
			textfield[i].setText("");
		}
	}

}
