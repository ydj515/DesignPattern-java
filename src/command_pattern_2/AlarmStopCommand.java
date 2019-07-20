package command_pattern_2;

public class AlarmStopCommand implements Command {

	private AlarmClock alarmClock;

	public AlarmStopCommand(AlarmClock alarmClock) {
		this.alarmClock = alarmClock;
	}

	@Override
	public void execute() {
		alarmClock.stop();
	}

}
