package singleton_pattern_lazyholder;


public class Main {

	public static void main(String[] args) {

		User[] users = new User[5];
		int i = 0;

		for (User user : users) {
			users[i] = new User("insang" + i);
			users[i].start();
			i++;
		}

	}

}
