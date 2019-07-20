package observer_pattern_1;

import java.util.List;

public class DataSheetView implements Observer { // observer

	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		List<Integer> scores = scoreRecord.getScores();

		for (int i = 0; i < viewCount && i < scores.size(); i++) {
			System.out.println(scores.get(i));
		}
		System.out.println("===================================");
	}

}
