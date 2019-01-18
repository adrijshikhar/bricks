import java.awt.*;
import java.awt.event.*;

import java.util.Random;

public class Bricks extends Thread{

public void run() {
	Button b;
	Random rand;
	int i;
	
	
try {
	
		b=new Button();
		b.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
						}
			public void mousePressed(MouseEvent arg0) {
			
				Bullet t=new Bullet(MyFrame.x);
				t.start();
				
			}
			public void mouseExited(MouseEvent arg0) {
			
			}
			

			public void mouseEntered(MouseEvent arg0) {
		
			}
			
	
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(""+arg0.getX());
				
			}
		});
		
		MyFrame.contentPane.add(b);
		rand = new Random();
		i = rand.nextInt(357);
		
		for(int k=-60;k<=751;k++)
		{
		MyFrame.bxs.add(i);
		MyFrame.bys.add(k);
		
		b.setBounds(i,k,35,35);
		Thread.sleep(9);
	
		}
		}
		catch(Exception e)
	{
	}

}



}

