package strategy_pattern;

public class GunStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I can attack with gun");
	}

}
