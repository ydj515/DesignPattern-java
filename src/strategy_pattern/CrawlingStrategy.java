package strategy_pattern;

public class CrawlingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can crawl");
	}

}
