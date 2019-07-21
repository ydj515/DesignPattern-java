package abstractFactory_pattern;

public abstract class AbstractFactory {
	
	public void create() {
		createMotor();
		createDoor();
	}

	public abstract Motor createMotor();

	public abstract Door createDoor();

}
