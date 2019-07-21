package factoryMethod_pattern_2;

public class MyFilter {

	private int n;

	public MyFilter(int n) {
		this.n = n;
	}

	public MazeGame create() {
		MazeGame mazeGame = null;
		if (n == 1) {
			System.out.println("mazeGame");
			mazeGame = new MazeGame();
		} else if (n == 2) {
			System.out.println("EnchantedMazeGame");
			mazeGame = new EnchantedMazeGame();
		}

		return mazeGame;
	}

}
