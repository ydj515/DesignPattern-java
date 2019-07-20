package observer_pattern_1;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer { // observer

	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		List<Integer> scores = scoreRecord.getScores();

		int min = Collections.min(scores, null);
		int max = Collections.max(scores, null);

		System.out.println("min : " + min);
		System.out.println("max : " + max);

	}

}
