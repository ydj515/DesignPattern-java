package decorator_pattern_2;

public class Mushroom extends PizzaDecorator {

	public Mushroom(Pizza pizza) {
		super(pizza);
	}

	public void info() {
		super.info();
		System.out.println("mushroom : 800");
	}

	public int cost() {
		return 800 + super.cost();
	}

}
