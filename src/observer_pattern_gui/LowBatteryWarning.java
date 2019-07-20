package observer_pattern_gui;

public class LowBatteryWarning implements Observer {

	private static final int LOW_BATTERY = 30;
	private Battery battery;

	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void update() {

		int level = battery.getLevel();

		if (level < LOW_BATTERY) { // 배터리 잔량이 LOW_BATTERY(30)보다 작으면 경고 메시지를 출력함
			new LowBatteryWarningPannel(battery); // warningPannel을 부른다
		}
	}

}
