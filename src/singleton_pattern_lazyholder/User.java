package singleton_pattern_lazyholder;

public class User extends Thread {

	public User(String name) {
		super(name);
	}

	public void run() {
		Something s = Something.getInstance();
		System.out.println(Thread.currentThread().getName() + " using " + s.toString());
	}
}
