package factoryMethod_pattern_2;

public class Door extends MapSite {

	private boolean isOpen = true;

	public Door(Room r1, Room r2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter() {
		if (isOpen) {
			System.out.println("door에 입장");
		} else {
			System.out.println("door에 입장 불가");
		}

	}

}
