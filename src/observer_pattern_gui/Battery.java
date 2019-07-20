package observer_pattern_gui;


public class Battery extends Subject { // 변경 관리 대상이 되는 데이터는 Subject를 상송함

	private int level = 100;

	public void consume(int amount) {
		level -= amount;
		notifyObservers(); // 데이터 변경 시 Subject 클래스의 notifyObservers 메소드를 호출함
	}
	public void charge(int amount) {
		level += amount;
		notifyObservers(); // 데이터 변경 시 Subject 클래스의 notifyObservers 메소드를 호출함
	}

	public int getLevel() {
		return level;
	}
}
