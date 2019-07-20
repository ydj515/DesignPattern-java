package observer_pattern_gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LowBatteryWarningPannel extends JPanel {

	private Battery battery;
	JLabel label;

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public LowBatteryWarningPannel(Battery battery) {
		this.battery = battery;
		setLayout(null);
		setBackground(new Color(179, 199, 217));
		setBounds(120, 180, 150, 20);
		setVisible(false);
		label = new JLabel("WARNING!!");
		label.setBounds(20, 0, 220, 20);
		label.setFont(new Font("Ariel", Font.BOLD, 20));
		label.setVisible(true);
		add(label);

		myThread th = new myThread();
		th.start();

	}

	class myThread extends Thread {

		public myThread() {

		}

		public void run() {
			while (true) {
				try {

					label.setForeground(Color.RED);
					Thread.sleep(500);
					label.setForeground(Color.BLUE);
					Thread.sleep(500);

				}

				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}