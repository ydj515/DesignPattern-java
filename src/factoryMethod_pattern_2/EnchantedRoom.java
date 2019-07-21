package factoryMethod_pattern_2;

public class EnchantedRoom extends Room {

	public EnchantedRoom(int roomNumber) {
		super(roomNumber);
	}

	@Override
	public void enter() {
		System.out.println("enchanted Room에 입장");
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
		return super.getRoomNumber();
	}

	public void setRoomNumber(int roomNumber) {
		super.setRoomNumber(roomNumber);
	}

	public void setSide(String direction, Wall wall) {
		super.setSide(direction, wall);
	}

	public void setSide(String direction, Door door) {
		super.setSide(direction, door);
	}

	// public void getSide(String west, Wall wall) {
	// super.getSide(west, wall);
	// }

}
