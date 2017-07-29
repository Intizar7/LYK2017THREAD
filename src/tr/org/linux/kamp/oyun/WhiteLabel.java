package tr.org.linux.kamp.oyun;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WhiteLabel extends JLabel {

	public WhiteLabel(String text) {
		super(text);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));//çerçeve 
		setVerticalAlignment(SwingConstants.CENTER);
		setHorizontalTextPosition(SwingConstants.CENTER);		
	}
}
