
public class Timer extends Thread {
	public void run() {
		try {
			for (int i = 60; i >= 0; i--) {
				Thread.sleep(1000);
				MyFrame.label.setText("" + i);

			}
		} catch (Exception e) {
		}
	}
}
