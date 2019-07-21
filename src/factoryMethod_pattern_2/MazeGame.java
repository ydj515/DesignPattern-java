package factoryMethod_pattern_2;

public class MazeGame {

	protected static String North = "North";
	protected static String East = "East";
	protected static String South = "South";
	protected static String West = "West";

	public Maze makeMaze() {
		return new Maze();
	}

	public Room makeRoom(int n) {
		System.out.println(n + "번 방 생성");
		return new Room(n);
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Door makeDoor(Room r1, Room r2) {
		// System.out.println(r1.getRoomNumber() + "번 방에 " + "door 생성");
		// System.out.println(r2.getRoomNumber() + "번 방에 " + "door 생성");
		return new Door(r1, r2);
	}

	// Create the maze.
	// Factory Method
	public Maze createMaze() {
		System.out.println("미로 생성");
		Maze maze = makeMaze();

		// create room
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);

		// create door
		Door door = makeDoor(r1, r2);

		// add to room
		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(MazeGame.North, makeWall());
		r1.setSide(MazeGame.East, door);
		r1.setSide(MazeGame.South, makeWall());
		r1.setSide(MazeGame.West, makeWall());

		r2.setSide(MazeGame.North, makeWall());
		r2.setSide(MazeGame.East, makeWall());
		r2.setSide(MazeGame.South, makeWall());
		r2.setSide(MazeGame.West, door);

		return maze;
	}

}
