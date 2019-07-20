package observer_pattern_gui;

public class BatteryLevelDisplay implements Observer { // 변경을 통보받는 클래스는 Observer를 구현함

	private Battery battery;

	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void update() { // 변경 관리 대상이 되는 데이터, 즉 Battery 클래스의 변경 시 호출되는 메소드

		int level = battery.getLevel();

		new BatteryDisplayPannel(battery);
	}

	public Battery getBattery() {
		return battery;
	}

}
