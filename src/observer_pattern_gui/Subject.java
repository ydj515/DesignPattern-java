package observer_pattern_gui;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // 추상화된 변경 관심 대상 데이터

	private List<Observer> observers = new ArrayList<Observer>(); // 추상화된 통보 대상 목록

	public void attach(Observer observer) { // 옵저버. 통보 대상 추가
		observers.add(observer);
	}

	public void detach(Observer observer) { // 옵저버. 통보 대상 제거
		observers.remove(observer);
	}

	public void notifyObservers() { // 옵저버에게 변경을 통보
		for (Observer o : observers) {
			o.update();
		}
	}
}
