package flyweight_pattern_2;

public class Main {

	public static void main(String[] args) {

		FlyweightFactory factory = new FlyweightFactory();

		Flyweight flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);

		Flyweight flyweight2 = factory.getFlyweight("B");
		System.out.println(flyweight2);

		Flyweight flyweight3 = factory.getFlyweight("C");
		System.out.println(flyweight3);

		Flyweight flyweight4 = factory.getFlyweight("B");
		System.out.println(flyweight4);

		Flyweight flyweight5 = factory.getFlyweight("A");
		System.out.println(flyweight5);

		Flyweight flyweight6 = factory.getFlyweight("A");
		System.out.println(flyweight6);

	}

}
