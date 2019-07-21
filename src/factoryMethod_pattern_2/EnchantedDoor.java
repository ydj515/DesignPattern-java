package factoryMethod_pattern_2;

public class EnchantedDoor extends Door {

	private boolean isOpen = true;

	public EnchantedDoor(Room r1, Room r2) {
		super(r1, r2);
	}

	@Override
	public void enter() {
		if (isOpen) {
			System.out.println("Enchanted door에 입장");
		} else {
			System.out.println("Enchanted door에 입장 불가");
		}
	}

}
