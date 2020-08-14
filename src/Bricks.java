import java.awt.*;
import java.awt.event.*;

import java.util.Random;

public class Bricks extends Thread {

	public void run() {
		Button b;
		Random rand;
		int i;

		try {

			b = new Button();
			b.addMouseListener(new MouseListener() {

				public void mouseReleased(final MouseEvent arg0) {
				}

				public void mousePressed(final MouseEvent arg0) {

					final Bullet t = new Bullet(MyFrame.x);
					t.start();

				}

				public void mouseExited(final MouseEvent arg0) {

				}

				public void mouseEntered(final MouseEvent arg0) {

				}

				public void mouseClicked(final MouseEvent arg0) {
					System.out.println("" + arg0.getX());

				}
			});

			MyFrame.contentPane.add(b);
			rand = new Random();
			i = rand.nextInt(357);

			for (int k = -60; k <= 751; k++) {
				MyFrame.bxs.add(i);
				MyFrame.bys.add(k);

				b.setBounds(i, k, 35, 35);
				Thread.sleep(9);

			}
		} catch (final Exception e) {
		}

	}

}
