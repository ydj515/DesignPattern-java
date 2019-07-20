package observer_pattern_1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject { // 구체적인 변경 감시 대상 데이터

	private List<Integer> scores = new ArrayList<Integer>();

	public void addScore(int score) {
		scores.add(score);
		notifyObservers(); // 데이터가 변경되면 Subject 클래스의 notifyObservers()를 호출해 각 옵저버에게 데이터 변경을 통보
	}

	public List<Integer> getScores() {
		return scores;
	}
}
