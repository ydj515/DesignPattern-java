package command_pattern_2;

public class TvOnCommand implements Command {

	private Tv tv;

	public TvOnCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		System.out.println("Tv on");
	}

}
