package decorator_pattern_2;

public class plainPizza extends Pizza {

	@Override
	public void info() {
		System.out.println("pizza : 1000");
	}

	@Override
	public int cost() {
		return 1000;
	}

}
