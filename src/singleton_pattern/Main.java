package singleton_pattern;

public class Main {

	public static void main(String[] args) {
		
		/*Printer printer1 = Printer.getInstance();
		printer1.print("Hi hello");
		
		Printer printer2 = Printer.getInstance();
		printer2.print("aaa");
		
		System.out.println("Printer1 is " + printer1.toString());
		System.out.println("Printer1 is " + printer2.toString());*/
		
		User[] users = new User[5];
		int i = 0;
		
		
		for(User user: users) {
			users[i] = new User("insang" + i);
			users[i].start();
			i++;
		}
	}
}
