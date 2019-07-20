package observer_pattern_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDisplayPannel extends JPanel {

	JButton chargeButton;
	JButton consumeButton;
	BatteryDisplayPannel batteryDisplayPannel;
	LowBatteryWarningPannel lowBatteryWarningPannel;
	FullChargeBatteryPannel fullChargeBatteryPannel;
	ChargingPannel chargingPannel;

	Battery battery;
	JLabel label;

	Boolean f = false; // 충전 버튼을 눌르는지 에 대한 flag
	Boolean f2 = false; // 소모 버튼을 눌르는지 에 대한 flag

	public ButtonDisplayPannel(Battery battery, BatteryDisplayPannel batteryDisplayPannel,
			LowBatteryWarningPannel lowBatteryWarningPannel, FullChargeBatteryPannel fullChargeBatteryPannel,
			ChargingPannel chargingPannel) {
		this.batteryDisplayPannel = batteryDisplayPannel;
		this.lowBatteryWarningPannel = lowBatteryWarningPannel;
		this.fullChargeBatteryPannel = fullChargeBatteryPannel;
		this.chargingPannel = chargingPannel;
		this.battery = battery;

		setBackground(new Color(179, 199, 217));
		setBounds(100, 0, 180, 180);

		setLayout(null);

		chargeButton = new JButton("충전");
		chargeButton.setFont(new Font("Ariel", Font.BOLD, 20));
		chargeButton.setBounds(30, 20, 120, 60);
		chargeButton.setBorderPainted(false);

		chargeButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				chargeButton.setBorderPainted(true);
			}

			public void mouseExited(MouseEvent e) {
				chargeButton.setBorderPainted(false);
			}
		});
		add(chargeButton);

		Vector<MyThread> v = new Vector<MyThread>(); // thread 백터로 thread를 죽였다 살렸다 한다. 충전을 누르면 스레드 하나 생성. 버튼을 다시 누르면 스레드
														// 죽인다.

		chargeButton.addActionListener(new ActionListener() { // 충전 버튼을 눌렀다면

			@Override
			public void actionPerformed(ActionEvent e) {
				if (f == false) {
					v.add(new MyThread(-1));
					f = true;
					v.lastElement().flag = true;
					chargingPannel.setVisible(true);

				} else {
					v.lastElement().flag = false;
					f = false;
					chargingPannel.setVisible(false);
				}
				v.lastElement().start();

			}
		});

		consumeButton = new JButton("소모");
		consumeButton.setFont(new Font("Ariel", Font.BOLD, 20));
		consumeButton.setBounds(30, 110, 120, 60);
		add(consumeButton);
		consumeButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				consumeButton.setBorderPainted(true);
			}

			public void mouseExited(MouseEvent e) {
				consumeButton.setBorderPainted(false);
			}
		});

		Vector<MyThread> v2 = new Vector<MyThread>(); // thread 백터로 thread를 죽였다 살렸다 한다. 소모를 누르면 스레드 하나 생성. 버튼을 다시 누르면
														// 스레드 죽인다.

		consumeButton.addActionListener(new ActionListener() { // 충전 버튼을 눌렀다면

			@Override
			public void actionPerformed(ActionEvent e) {
				if (f2 == false) { // 스레드 시작
					v2.add(new MyThread(1));
					f2 = true;
					v2.lastElement().flag = true;
				} else { // 충전 버튼을 다시 누른다면
					v2.lastElement().flag = false; // 스레드 종료
					f2 = false;
				}

				v2.lastElement().start();

			}

		});

		setVisible(true);
	}

	class MyThread extends Thread { // 왼쪽 상단의 배터리 이미지 표시

		int i;
		Boolean flag = false;
		int level;
		JLabel imageLabel = batteryDisplayPannel.label;
		JLabel[] imageLabelArray = batteryDisplayPannel.imageLabelArray;
		JLabel label = batteryDisplayPannel.label;
		ImageIcon[] icons = batteryDisplayPannel.icons;
		Color[] colors = batteryDisplayPannel.colors;

		public MyThread(int i) {
			this.i = i;
		}

		public void run() {

			while (flag) {
				try {
					if (battery.getLevel() == 100 || battery.getLevel() == 0) {
						flag = false;
					}
					level = battery.getLevel();

					battery.consume(i);
					label.setText(level + "%");

					if (level < 100) {
						fullChargeBatteryPannel.setVisible(false);
					} else { // 100%라면 full charge pannel을 보이게 한다
						fullChargeBatteryPannel.setVisible(true);
					}

					if (level > 30) {
						lowBatteryWarningPannel.setVisible(false);
					} else { // level 값이 30이상 이면 warning 메시지를 띄우게 한다
						lowBatteryWarningPannel.setVisible(true);
					}

					if (level < 10) { // 배터리가 10% 미만이 된다면
						imageLabel = imageLabelArray[0];
						label.setForeground(colors[0]);
						imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
						batteryDisplayPannel.add(imageLabel);
						imageLabelArray[0].setVisible(true);
						imageLabelArray[1].setVisible(false);
						imageLabelArray[2].setVisible(false);
						imageLabelArray[3].setVisible(false);
						imageLabelArray[4].setVisible(false);
					} else if (level >= 10 && level <= 25) { // 10% ~ 25%
						imageLabel = imageLabelArray[1];
						label.setForeground(colors[1]);
						imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
						batteryDisplayPannel.add(imageLabel);
						imageLabelArray[0].setVisible(false);
						imageLabelArray[1].setVisible(true);
						imageLabelArray[2].setVisible(false);
						imageLabelArray[3].setVisible(false);
						imageLabelArray[4].setVisible(false);
					} else if (level > 25 && level <= 50) { // 25% ~ 50%
						imageLabel = imageLabelArray[2];
						label.setForeground(colors[2]);
						imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
						batteryDisplayPannel.add(imageLabel);
						imageLabelArray[0].setVisible(false);
						imageLabelArray[1].setVisible(false);
						imageLabelArray[2].setVisible(true);
						imageLabelArray[3].setVisible(false);
						imageLabelArray[4].setVisible(false);
					} else if (level > 50 && level <= 75) { // 50% ~ 75%
						imageLabel = imageLabelArray[3];
						label.setForeground(colors[3]);
						imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
						batteryDisplayPannel.add(imageLabel);
						imageLabelArray[0].setVisible(false);
						imageLabelArray[1].setVisible(false);
						imageLabelArray[2].setVisible(false);
						imageLabelArray[3].setVisible(true);
						imageLabelArray[4].setVisible(false);
					} else if (level > 75) { // 75% 이상
						imageLabel = imageLabelArray[4];
						label.setForeground(colors[4]);
						imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
						batteryDisplayPannel.add(imageLabel);
						imageLabelArray[0].setVisible(false);
						imageLabelArray[1].setVisible(false);
						imageLabelArray[2].setVisible(false);
						imageLabelArray[3].setVisible(false);
						imageLabelArray[4].setVisible(true);
					}

					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
