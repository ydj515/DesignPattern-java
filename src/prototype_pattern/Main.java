package prototype_pattern;

public class Main {

	public static void main(String[] args) {

		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("red").addColor();
		ColorStore.getColor("red").addColor();
		ColorStore.getColor("blue").addColor();

	}

}
