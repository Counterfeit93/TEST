package projekt.zaliczenie.application.gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Label {
	
	private Font font = new Font("AvantGarde",Font.BOLD,15);
	JLabel [] describeLabel(JPanel panel,int numberOfLabels)
	{
		JLabel []label = new JLabel[numberOfLabels];
		for (int i=0;i<label.length;i++)
			{
				label[i]= new JLabel();
				label[i].setFont(font);
				panel.add(label[i]);
			}
		addLabel(label);
		return label;
	}
		
		void addLabel(JLabel [] label)
		{
			int baseYpos = 50;
			for (int i=0;i<label.length;i++)
			{
				label[i].setBounds(230, baseYpos , 400, 60);
					baseYpos +=100;
			}
		}
		
		void clearLabel(JLabel [] label,int minRange, int maxRange)
		{
			for (int i=minRange;i <=maxRange;i++)
			{
				label[i].setText("");
			}
		}
	
	

}
