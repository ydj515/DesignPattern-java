package facade_pattern;

public class Main {

	public static void main(String[] args) {

		Facade facade = new Facade();

		facade.turnOnOperationTvMode();
		System.out.println("===================");
		facade.turnOffOperationWideScreen();
	}

}
