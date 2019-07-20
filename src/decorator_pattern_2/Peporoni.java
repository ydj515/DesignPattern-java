package decorator_pattern_2;

public class Peporoni extends PizzaDecorator {

	public Peporoni(Pizza pizza) {
		super(pizza);
	}

	public void info() {
		super.info();
		System.out.println("peporoni : 500");
	}

	public int cost() {
		return 500 + super.cost();
	}

}
