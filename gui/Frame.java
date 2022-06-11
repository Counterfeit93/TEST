package projekt.zaliczenie.application.gui;

import javax.swing.JFrame;

public class Frame {
	
	JFrame frame;
		void describeFrame()
		{ 	
			frame = new JFrame("Chat");
			frame.setSize(1280, 720);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.dispose();
			frame.setUndecorated(false);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
