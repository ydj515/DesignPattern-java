package decorator_pattern_2;

public class Pimang extends PizzaDecorator {

	public Pimang(Pizza pizza) {
		super(pizza);
	}

	public void info() {
		super.info();
		System.out.println("pimang : 300");
	}

	public int cost() {
		return 300 + super.cost();
	}

}
