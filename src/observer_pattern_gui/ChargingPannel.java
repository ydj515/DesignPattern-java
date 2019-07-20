package observer_pattern_gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChargingPannel extends JPanel {

	JLabel imagelabel1;
	JLabel imagelabel2;
	JLabel imagelabel3;
	JLabel imagelabel4;
	JLabel imagelabel5;

	ImageIcon icon1 = new ImageIcon("image/111.png");
	ImageIcon icon2 = new ImageIcon("image/222.png");
	ImageIcon icon3 = new ImageIcon("image/333.png");
	ImageIcon icon4 = new ImageIcon("image/444.png");
	ImageIcon icon5 = new ImageIcon("image/555.png");

	public ChargingPannel() { // 충전 버튼을 눌렀다면 이모티콘을 출력한다.

		setBackground(new Color(179, 199, 217));
		setBounds(100, 200, 100, 50);

		setLayout(null);

		imagelabel1 = new JLabel(icon1);
		imagelabel1.setBounds(30, -5, 60, 60);
		add(imagelabel1);

		imagelabel2 = new JLabel(icon2);
		imagelabel2.setBounds(30, -5, 60, 60);
		add(imagelabel2);

		imagelabel3 = new JLabel(icon3);
		imagelabel3.setBounds(30, -5, 60, 60);
		add(imagelabel3);

		imagelabel4 = new JLabel(icon4);
		imagelabel4.setBounds(30, -5, 60, 60);
		add(imagelabel4);

		imagelabel5 = new JLabel(icon5);
		imagelabel5.setBounds(30, -5, 60, 60);
		add(imagelabel5);

		MyThread myThread = new MyThread();
		myThread.start();

		setVisible(false);

	}

	class MyThread extends Thread {
		public MyThread() {

		}

		public void run() {
			while (true) {

				try {
					imagelabel1.setVisible(true);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(false);
					imagelabel4.setVisible(false);
					imagelabel5.setVisible(false);
					Thread.sleep(100);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(true);
					imagelabel3.setVisible(false);
					imagelabel4.setVisible(false);
					imagelabel5.setVisible(false);
					Thread.sleep(100);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(true);
					imagelabel4.setVisible(false);
					imagelabel5.setVisible(false);
					Thread.sleep(100);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(false);
					imagelabel4.setVisible(true);
					imagelabel5.setVisible(false);
					Thread.sleep(100);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(false);
					imagelabel4.setVisible(false);
					imagelabel5.setVisible(true);
					Thread.sleep(100);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
