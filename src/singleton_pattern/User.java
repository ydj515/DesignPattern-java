package singleton_pattern;

public class User extends Thread {
	
	public User(String name) {
		super(name);
	}

	@Override
	public void run() {
		
		Printer printer = Printer.getInstance();
		printer.print(Thread.currentThread().getName() + " using " + printer.toString());
	}
}
