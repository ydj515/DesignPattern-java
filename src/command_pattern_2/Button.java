package command_pattern_2;

public class Button {

	private Command command1; // on
	private Command command2; // off

	public void setCommand(Command command1, Command command2) {
		this.command1 = command1;
		this.command2 = command2;
	}

	public void on_button_pressed() {
		command1.execute();
	}

	public void off_button_pressed() {
		command2.execute();
	}

}
