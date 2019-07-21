package factoryMethod_pattern_2;

public class EnchantedMazeGame extends MazeGame {

	public Room makeRoom(int n) {
		return new EnchantedRoom(n);
	}

	public Wall makeWall() {
		return new EnchantedWall();
	}

	public Door makeDoor(Room r1, Room r2) {
		return new EnchantedDoor(r1, r2);
	}

	@Override
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

		r1.setSide(MazeGame.North, door);
		r1.setSide(MazeGame.East, makeWall());
		r1.setSide(MazeGame.South, makeWall());
		r1.setSide(MazeGame.West, makeWall());

		r2.setSide(MazeGame.North, makeWall());
		r2.setSide(MazeGame.East, makeWall());
		r2.setSide(MazeGame.South, makeWall());
		r2.setSide(MazeGame.West, door);

		return maze;

	}
}
