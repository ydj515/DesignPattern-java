package strategy_pattern;

public class WalkingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can walk");
	}

}
