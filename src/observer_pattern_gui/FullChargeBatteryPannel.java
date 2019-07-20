package observer_pattern_gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FullChargeBatteryPannel extends JPanel {

	JLabel label;

	JLabel imagelabel1;
	JLabel imagelabel2;
	JLabel imagelabel3;

	ImageIcon icon1 = new ImageIcon("image/11.png");
	ImageIcon icon2 = new ImageIcon("image/22.png");
	ImageIcon icon3 = new ImageIcon("image/33.png");

	public FullChargeBatteryPannel(Battery battery) {

		setLayout(null);
		setBackground(new Color(179, 199, 217));
		setBounds(0, 250, 300, 100);
		setVisible(false);
		label = new JLabel("FULL!!");
		label.setBounds(10, 0, 210, 50);
		label.setFont(new Font("Ariel", Font.BOLD, 20));
		label.setVisible(true);
		add(label);

		imagelabel1 = new JLabel(icon1);
		imagelabel1.setBounds(50, 0, 230, 100);
		add(imagelabel1);
		imagelabel2 = new JLabel(icon2);
		imagelabel2.setBounds(50, 0, 230, 100);
		add(imagelabel2);
		imagelabel3 = new JLabel(icon3);
		imagelabel3.setBounds(50, 0, 230, 100);
		add(imagelabel3);

		myThread th = new myThread();
		th.start();

		myThread2 th2 = new myThread2();
		th2.start();
	}

	class myThread2 extends Thread { // 꺼억 이모티콘 // full charge가 되었다면 나타낸다
		public myThread2() {

		}

		public void run() {
			while (true) {
				try {
					imagelabel1.setVisible(true);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(false);
					Thread.sleep(500);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(true);
					imagelabel3.setVisible(false);
					Thread.sleep(500);
					imagelabel1.setVisible(false);
					imagelabel2.setVisible(false);
					imagelabel3.setVisible(true);
					Thread.sleep(500);

				}

				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class myThread extends Thread { // full charge가 되면 full charge 글자 출력

		public myThread() {

		}

		public void run() {
			while (true) {
				try {

					label.setForeground(Color.GREEN);
					Thread.sleep(500);
					label.setForeground(Color.LIGHT_GRAY);
					Thread.sleep(500);

				}

				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
