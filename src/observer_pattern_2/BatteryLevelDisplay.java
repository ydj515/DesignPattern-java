package observer_pattern_2;

public class BatteryLevelDisplay implements Observer { // observer

	private Battery battery;

	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}

	public void update() {

		int level = battery.getLevel();
		System.out.println("Level : " + level);
	}

}
