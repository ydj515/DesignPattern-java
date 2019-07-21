package factoryMethod_pattern_2;

import java.util.Vector;

public class Maze {

	protected Vector<Room> rooms = new Vector<Room>();

	public void addRoom(Room r1) {
		rooms.add(r1);
	}

	public int getRoomNo(int index) {
		return rooms.get(index).getRoomNumber();
	}

	public Room getRoom(int index) {
		return rooms.get(index);
	}

}
