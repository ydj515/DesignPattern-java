package abstractFactory_pattern;

public class SAMSUNGFactory extends AbstractFactory {

	@Override
	public Motor createMotor() {
		return new SAMSUNGMotor();
	}

	@Override
	public Door createDoor() {
		return new SAMSUNGDoor();
	}

}
