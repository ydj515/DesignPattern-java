package decorator_pattern_2;

public class Main {

	public static void main(String[] args) {

		Pizza pizza = new plainPizza(); // plain
		pizza.info();
		System.out.println(">> total price : " + pizza.cost());
		System.out.println("========================");

		Pizza a = new Pimang(pizza); // plain + pimang
		a.info();
		System.out.println(">> total price : " + a.cost());
		System.out.println("========================");

		Pizza b = new Onion(pizza); // plain + onion
		b.info();
		System.out.println(">> total price : " + b.cost());
		System.out.println("========================");

		Pizza c = new Peporoni(pizza); // plain + peporoni
		c.info();
		System.out.println(">> total price : " + c.cost());
		System.out.println("========================");

		Pizza d = new Mushroom(pizza); // plain + mushroom
		d.info();
		System.out.println(">> total price : " + d.cost());
		System.out.println("========================");

		Pizza combination = new Mushroom(new Peporoni(new Onion(new Pimang(pizza)))); // 모든 토핑 추가
		combination.info();
		System.out.println(">> total price : " + combination.cost());
		System.out.println("========================");
	}

}
