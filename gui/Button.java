package projekt.zaliczenie.application.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Button {
	
	
	JButton [] describeButton(JPanel panel,String []inscription,Object listener,int baseXpos, int baseYpos,int changeXpos, int changeYpos)
	{
		JButton [] button = new JButton[inscription.length];
		Font font = new Font("TimesRoman",Font.ROMAN_BASELINE,20);
		for (int i=0;i<inscription.length;i++)
		{
			button[i] = new JButton(inscription[i]);
			button[i].setFocusable(true);
			button[i].setBackground(Color.WHITE);
			button[i].addActionListener((ActionListener) listener);
			button[i].setFont(font);
			panel.add(button[i]);
		}
		buttonAxesSpecification(button,baseXpos,baseYpos,changeXpos,changeYpos);
		return button;
	}
	
	void buttonAxesSpecification(JButton [] button,int baseXpos, int baseYpos,int changeXpos, int changeYpos) 
	{
		int x=2;
		int y=0;
		int counter=0;
		if(button.length%2==1)
		{
			y=(button.length+1)/2;
		}
		if(button.length%2==0)
		{
			y=button.length/2;
		}
		for (int i=0;i<y;i++)
		{
			if (counter==button.length-1)
			{
				x=1;
			}
			for (int j=0;j<x;j++)
			{
				button[counter].setBounds(baseXpos,baseYpos,400,80);
				baseYpos=baseYpos+changeYpos;
				baseXpos=baseXpos+changeXpos;
				counter++;
			}
			if(changeXpos!=0)
			{
				baseYpos=baseYpos-(2*changeYpos);
			}
		//baseXpos=baseXpos+changeXpos;
		}
	}
	

}
