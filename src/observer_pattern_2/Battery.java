package observer_pattern_2;

public class Battery extends Subject { // 구체적인 변경 감시 대상 데이터

	private int level = 100;
	private BatteryLevelDisplay display;
	private LowBatteryWarning warning;

	public void setDisplay(BatteryLevelDisplay display) {
		this.display = display;
	}

	public void setWarning(LowBatteryWarning warning) {
		this.warning = warning;
	}

	public void consume(int amount) {
		level -= amount;
		notifyObservers(); // 데이터가 변경되면 Subject 클래스의 notifyObservers()를 호출해 각 옵저버에게 데이터 변경을 통보
		// display.update();
		// warning.update();
	}

	public int getLevel() {
		return level;
	}

}
