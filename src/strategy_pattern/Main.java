package strategy_pattern;

public class Main {

	public static void main(String[] args) {

		Robot sungard = new Sungard("insang sungard");

		sungard.setAttackStrategy(new MissileStrategy());
		sungard.setMovingStrategy(new FlyingStrategy());

		sungard.attack();
		sungard.move();

		Robot atom = new Atom("insang atom");

		atom.setAttackStrategy(new GunStrategy());
		atom.setMovingStrategy(new CrawlingStrategy());

		atom.attack();
		atom.move();

		//sungard�� movingStrategy ����
		sungard.setMovingStrategy(new CrawlingStrategy());
		sungard.attack();
		sungard.move();
	}

}
