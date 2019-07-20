package observer_pattern_gui;

public class FullCharge implements Observer {

	private static final int FULL_CHARGE = 100;
	private Battery battery;

	public FullCharge(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void update() {

		int level = battery.getLevel();

		if (level >= FULL_CHARGE) { // 배터리 잔량이 LOW_BATTERY(30)보다 작으면 경고 메시지를 출력함
			new FullChargeBatteryPannel(battery);
		}

	}

}
