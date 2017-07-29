package tr.org.linux.kamp.oyun;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.Clock;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JPanel{

	private JLabel label;
	private JLabel centerLabel;
	private JLabel northLabel;
	private JLabel southLabel;
	private JLabel eastLabel;
	private JLabel westLabel;
	
	public JPanelExample() {
		
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		
		centerLabel=new WhiteLabel("Center");
		northLabel=new WhiteLabel("North Remember");
		southLabel=new WhiteLabel("South");
		eastLabel=new WhiteLabel("East");
		westLabel=new WhiteLabel("Wild West");
		
		add(centerLabel,BorderLayout.CENTER);
		add(northLabel,BorderLayout.NORTH);
		add(southLabel,BorderLayout.SOUTH);
		add(eastLabel,BorderLayout.EAST);
		add(westLabel,BorderLayout.WEST);
		
		label =new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(5,5,200,100);
		label.setBorder(BorderFactory.createLineBorder(Color.RED));
		add(label);
	}
	
}
