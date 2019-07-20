package command_pattern_2;

public class Main {

	public static void main(String[] args) {

		Button button = new Button();

		Lamp lamp = new Lamp();
		Command onCommand = new LampOnCommand(lamp); // 램프를 켜는 커맨드를 설정
		Command offCommand = new LampOffCommand(lamp); // 램프를 켜는 커맨드를 설정
		Command middleCommand = new LampMiddleCommand(lamp); // 램프를 중간 밝기로 켜는 커맨드를 설정
		button.setCommand(onCommand, offCommand); // 커맨드를 모두 붙힘(on, off)
		button.on_button_pressed();
		button.off_button_pressed();
		System.out.println("================");
		
		button.setCommand(onCommand, middleCommand); // on, middle이 작동하게 됨
		button.on_button_pressed();
		button.off_button_pressed();
		System.out.println("================");

		AlarmClock alarmClock = new AlarmClock();
		Command startCommand = new AlarmStartCommand(alarmClock);
		Command stopCommand = new AlarmStopCommand(alarmClock);
		button.setCommand(startCommand, stopCommand);
		button.on_button_pressed();
		button.off_button_pressed();
		System.out.println("================");

		Tv tv = new Tv();
		Command command1 = new TvOnCommand(tv);
		Command command2 = new TvOffCommand(tv);
		button.setCommand(command1, command2);
		button.on_button_pressed();
		button.off_button_pressed();
		System.out.println("================");

	}

}
