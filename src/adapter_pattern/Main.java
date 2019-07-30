package adapter_pattern;

public class Main {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		// run testDuck
		testDuck(duck);

		// run testDuck using turkey Adapter;
		testDuck(turkeyAdapter);

	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
