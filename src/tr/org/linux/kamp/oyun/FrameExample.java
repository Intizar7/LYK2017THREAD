package tr.org.linux.kamp.oyun;

import javax.swing.JFrame;//ilk görsel program java ile
public class FrameExample {
	
	public static void main(String[] args) {
		
		JPanelExample jPanel=new JPanelExample();
		JFrame frame=new JFrame();
		frame.setContentPane(jPanel);//panelimizin arka planını getiriyoruz
		//setContentPane 
		frame.setTitle("Hello");//en üstteki başlık
		frame.setSize(640,480);//boyutunu belirtiyor
		frame.setLocation(500,500);//konumu belirtiyoruz
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		jPanel.repaint();
	}

}
