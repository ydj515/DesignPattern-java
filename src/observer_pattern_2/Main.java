package observer_pattern_2;

public class Main {

	public static void main(String[] args) {

		Battery battery = new Battery();

		BatteryLevelDisplay batteryDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);

		// observer 추가
		battery.addObserver(batteryDisplay);
		battery.addObserver(lowBatteryWarning);

		battery.consume(20);
		battery.consume(50);
		battery.consume(10);

	}

}
