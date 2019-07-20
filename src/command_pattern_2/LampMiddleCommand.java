package command_pattern_2;

public class LampMiddleCommand implements Command {

	private Lamp theLamp;

	public LampMiddleCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		theLamp.turnMiddle();;
	}

}
