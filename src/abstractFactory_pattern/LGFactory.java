package abstractFactory_pattern;

public class LGFactory extends AbstractFactory {

	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

}
