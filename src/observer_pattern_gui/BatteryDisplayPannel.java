package observer_pattern_gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BatteryDisplayPannel extends JPanel {

	ImageIcon[] icons = { // 이미지 객체 배열
			new ImageIcon("image/1.jpg"), new ImageIcon("image/2.jpg"), new ImageIcon("image/3.jpg"),
			new ImageIcon("image/4.jpg"), new ImageIcon("image/5.jpg") };

	Color[] colors = { Color.BLACK, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN };

	JLabel imageLabel;
	JLabel[] imageLabelArray = { new JLabel(icons[0]), new JLabel(icons[1]), new JLabel(icons[2]), new JLabel(icons[3]),
			new JLabel(icons[4]) };
	JLabel label;
	int level;
	private Battery battery;

	public BatteryDisplayPannel(Battery battery) {
		this.battery = battery;
		this.level = battery.getLevel();

		setBackground(new Color(179, 199, 217));
		setBounds(0, 0, 120, 250);

		setLayout(null);

		setVisible(true);

		imageLabel = imageLabelArray[0];

		label = new JLabel(battery.getLevel() + "%");
		label.setBounds(30, 80, 150, 300);
		label.setFont(new Font("Ariel", Font.BOLD, 20));

		check(level);

		imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
		add(imageLabel);
		add(label);

	}

	public void check(int level) { // 배터리 잔량 check
		if (level >= 0 && level < 10) {
			imageLabel = imageLabelArray[0];
			label.setForeground(colors[0]);
			// imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
			add(imageLabel);
		} else if (level >= 10 && level <= 25) {
			imageLabel = imageLabelArray[1];
			label.setForeground(colors[1]);
			imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
			add(imageLabel);
		} else if (level > 25 && level <= 50) {
			imageLabel = imageLabelArray[2];
			label.setForeground(colors[2]);
			imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
			add(imageLabel);
		} else if (level > 50 && level <= 75) {
			imageLabel = imageLabelArray[3];
			label.setForeground(colors[3]);
			imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
			add(imageLabel);
		} else if (level > 75) {
			imageLabel = imageLabelArray[4];
			label.setForeground(colors[4]);
			imageLabel.setBounds(-25, -45, 150, 300); // 배터리 위치
			add(imageLabel);
		}

		// label.setText(battery.getLevel() + "%");

	}

}
