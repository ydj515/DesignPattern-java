package strategy_pattern;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I can attack with missiles");
	}

}
