package command_pattern_1;

public class Main {

	public static void main(String[] args) {

		Button button = new Button();

		Lamp lamp = new Lamp();
		Command onCommand = new LampOnCommand(lamp); // 램프를 켜는 커맨드를 설정
		Command offCommand = new LampOffCommand(lamp); // 램프를 끄는 커맨드를 설정
		
		button.setCommand(onCommand); // on 커맨드를 설정
		button.button_pressed();
		
		button.setCommand(offCommand); // off 커맨드를 설정
		button.button_pressed();

	}

}
