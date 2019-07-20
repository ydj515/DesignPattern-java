package command_pattern_2;

public class AlarmStartCommand implements Command {

	private AlarmClock alarmClock;

	public AlarmStartCommand(AlarmClock alarmClock) {
		this.alarmClock = alarmClock;
	}

	@Override
	public void execute() {
		alarmClock.start();
	}

}
