package decorator_pattern_2;

public abstract class PizzaDecorator extends Pizza {

	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void info() {
		pizza.info();
	}

	@Override
	public int cost() {
		return pizza.cost();
	}
}
