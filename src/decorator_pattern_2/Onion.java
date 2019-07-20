package decorator_pattern_2;

public class Onion extends PizzaDecorator {

	public Onion(Pizza pizza) {
		super(pizza);
	}

	public void info() {
		super.info();
		System.out.println("Onion : 900");
	}

	public int cost() {
		return 900 + super.cost();
	}
}
