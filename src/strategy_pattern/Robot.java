package strategy_pattern;

public abstract class Robot {

	private String name;
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	
	public void attack() {
		this.attackStrategy.attack();
	}
	
	public void move() {
		this.movingStrategy.move();
	}

}
