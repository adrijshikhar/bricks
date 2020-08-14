import java.awt.*;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.LinkedList;
import java.util.concurrent.*;

public class MyFrame extends Thread implements ActionListener {
	int tr;
	static int x = 187;
	JFrame frame;
	static JPanel contentPane;
	Button button_1;
	Bricks br = new Bricks();
	static Button button;
	static JLabel lblNewLabel, lblNewLabel_1, label;
	static LinkedList<Integer> bxs;
	static LinkedList<Integer> bys;

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		MyFrame f = new MyFrame();

	}

	public MyFrame() {
		lblNewLabel_1 = new JLabel();
		bxs = new LinkedList<Integer>();
		bys = new LinkedList<Integer>();
		frame = new JFrame();
		contentPane = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 417, 761);
		frame.setResizable(false);

		button_1 = new Button("");
		button_1.addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseMoved(MouseEvent arg0) {
				x = arg0.getX();
				button_1.setBounds(x - 42, 651, 90, 20);
				button.setBounds(x, 641, 10, 10);

			}
		});
		button_1.addActionListener(this);

		button_1.setBounds(147, 651, 90, 20);
		contentPane.add(button_1);

		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		button = new Button("");
		button.setBounds(187, 641, 10, 10);
		contentPane.add(button);

		lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(377, 693, 22, 14);
		contentPane.add(lblNewLabel);
		frame.setVisible(true);

		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(132, 255, 120, 120);
		contentPane.add(lblNewLabel_1);
		label = new JLabel("60");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(12, 694, 22, 14);
		contentPane.add(label);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			for (int i = 5; i >= 1; i--) {
				Thread.sleep(1000);
				lblNewLabel_1.setText("" + i);

			}
		} catch (Exception e) {
		}
		try {
			Thread.sleep(1000);
			lblNewLabel_1.setText("GO");
			Thread.sleep(1000);
			lblNewLabel_1.setText("");

			Thread.sleep(1000);
			lblNewLabel_1.setVisible(false);
		} catch (Exception e2) {

		}

		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Bullet t = new Bullet(x);
				t.start();
			}

		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				button_1.setBounds(x - 42, 651, 90, 20);
				button.setBounds(x, 641, 10, 10);
			}

		});
		Timer timer = new Timer();
		timer.start();
		tr = ThreadLocalRandom.current().nextInt(1000, 3001);

		try {
			Thread.sleep(1000);
			for (int k = 1; k <= 50; k++) {
				br = new Bricks();
				br.start();
				Thread.sleep(tr);

			}
		} catch (Exception e) {
		}

	}

	public void actionPerformed(ActionEvent e) {
		Bullet t = new Bullet(x);
		t.start();
	}
}
