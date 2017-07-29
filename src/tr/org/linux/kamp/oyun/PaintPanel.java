package tr.org.linux.kamp.oyun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	
	private Box box;
	
	public PaintPanel() {
		box=new Box(Color.BLUE);
		System.out.println("Kutu yaratıldı");
		StartMovement();
		System.out.println("Kutu Harekete başladı");
	}
	@Override
	protected void paintComponent(Graphics g) {//ctrl+space
		
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D graf =(Graphics2D) g;
		graf.fillRect(box.getX(), box.getY(), box.getWidth(),box.getHeight());
		graf.setColor(box.getColor());
		
		
		graf.setColor(Color.ORANGE);
		graf.fillRect(10,10, 200, 200);
		graf.setColor(Color.BLUE);
		graf.fillOval(200, 200, 150, 100);//oval yuvarlak
		//graf.fillRoundRect(100, 100, 100, 100, 100, 100); yuvarlak
		//graf.drawImage(img, x, y, observer)
	}
	public void StartMovementWithoutThread() {
		while (true) {
			System.out.println("Kutu şu anda :"+box.getX()+"pozisyonunda.");
			box.setX(box.getX()+5);
			repaint();
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}


	public void StartMovement() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random rand = new Random();
				int x,y;
				// TODO Auto-generated method stub
				while(true) {
					
					x=rand.nextInt(600);
					y=rand.nextInt(600);
					box.setColor(Color.RED);
					box.setX(x);
					box.setY(y);		
					repaint();
					try {
						Thread.sleep(50);
					}catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
