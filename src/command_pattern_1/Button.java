package command_pattern_1;

public class Button {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void button_pressed() {
		command.execute();
	}
	
}
