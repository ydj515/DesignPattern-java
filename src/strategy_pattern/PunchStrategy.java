package strategy_pattern;

public class PunchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I can attack with strong punches");

	}

}
