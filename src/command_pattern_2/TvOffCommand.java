package command_pattern_2;

public class TvOffCommand implements Command {

	private Tv tv;

	public TvOffCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		System.out.println("Tv off");
	}

}
