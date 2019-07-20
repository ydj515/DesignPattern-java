package observer_pattern_1;

public class Main {

	public static void main(String[] args) {

		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		// observer 추가
		scoreRecord.addObserver(dataSheetView);
		scoreRecord.addObserver(minMaxView);
		
		scoreRecord.addScore(90);
		scoreRecord.addScore(80);
		scoreRecord.addScore(95);
		scoreRecord.addScore(60);
		scoreRecord.addScore(75);

	}
}
