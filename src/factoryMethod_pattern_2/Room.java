package factoryMethod_pattern_2;

import java.util.Vector;

public class Room extends MapSite {

	private int roomNumber;
	private MapSite sides;
	protected Vector<String> direction = new Vector<String>();
	protected Vector<Boolean> isGo = new Vector<Boolean>();

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public void enter() {
		System.out.println("Room 에 입장");
	}

	public String getSide(String dir) {

		String s = null;

		for (int i = 0; i < direction.size(); i++) {
			if (direction.get(i).equals(dir)) {
				s = direction.get(i);
			}
		}

		return s;
	}

	public Boolean getGo(String dir) {

		boolean b = false;

		for (int i = 0; i < isGo.size(); i++) {
			if (direction.get(i).equals(dir)) {
				b = isGo.get(i);
			}
		}

		return b;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setSide(String direction, Wall wall) {
		this.direction.add(direction);
		this.isGo.add(false);
		this.sides = wall;
		System.out.println(roomNumber + "번 방 " + direction + "쪽 wall");
	}

	public void setSide(String direction, Door door) {
		this.direction.add(direction);
		this.isGo.add(true);
		this.sides = door;
		System.out.println(roomNumber + "번 방 " + direction + "쪽 door");
	}

}
