package observer_pattern_gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private JPanel mainPanel;
	private BatteryDisplayPannel batteryDisplayPannel;
	private ButtonDisplayPannel buttonDisplayPannel;
	private Battery battery;
	private LowBatteryWarningPannel lowBatteryWarningPannel;
	private FullChargeBatteryPannel fullChargeBatteryPannel;
	private ChargingPannel chargingPannel;
	Container c;

	private JLabel label;

	public MainFrame(Battery battery) {

		c = getContentPane();

		this.battery = battery;

		batteryDisplayPannel = new BatteryDisplayPannel(battery);
		lowBatteryWarningPannel = new LowBatteryWarningPannel(battery);
		fullChargeBatteryPannel = new FullChargeBatteryPannel(battery);
		chargingPannel = new ChargingPannel();
		buttonDisplayPannel = new ButtonDisplayPannel(battery, batteryDisplayPannel, lowBatteryWarningPannel,
				fullChargeBatteryPannel, chargingPannel);

		setTitle("배터리"); // frame에 이름을 단다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼을 누르면 프로그램 종료
		setBounds(100, 100, 280, 400);
		mainPanel = new JPanel();

		setContentPane(mainPanel);
		mainPanel.setLayout(null); // 위치 조정을 위한 layout을 null로 설정

		mainPanel.setBackground(new Color(179, 199, 217)); // 배경화면 색

		mainPanel.add(batteryDisplayPannel); // 메인 패널에 초기 패널 상태

		add(batteryDisplayPannel); // 패널 붙히기
		add(buttonDisplayPannel);
		add(lowBatteryWarningPannel);
		add(fullChargeBatteryPannel);
		add(chargingPannel);

		setVisible(true);
	}

	public static void main(String[] args) {

		Battery battery = new Battery();

		Observer batteryDisplay = new BatteryLevelDisplay(battery);
		Observer lowBatteryWarning = new LowBatteryWarning(battery);
		Observer fullCharge = new FullCharge(battery);

		battery.attach(batteryDisplay); // BatteryLevelDisplay 옵서버를 Battery(Subject)에 설정함
		battery.attach(lowBatteryWarning); // LowBatteryWarning 옵서버를 Battery(Subject)에 설정함
		battery.attach(fullCharge); // FullCharge 옵서버를 Battery(Subject)에 설정함
		battery.consume(10); // 초기값 설정

		MainFrame mainFrame = new MainFrame(battery);
	}

}
