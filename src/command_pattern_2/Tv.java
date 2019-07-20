package command_pattern_2;

public class Tv {
	
	private Command command1;
	private Command command2;
	

	public void setCommand(Command command1, Command command2) {
		this.command1 = command1;
		this.command2 = command2;
	}
}
