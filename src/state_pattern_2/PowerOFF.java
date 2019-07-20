package state_pattern_2;

public class PowerOFF implements State {

	@Override
	public void onButtonPush(TV tv) {
		System.out.println("tv on");
		tv.setState1(new PowerON());
	}

	@Override
	public void offButtonPush(TV tv) {
		System.out.println("그대로");
	}

	@Override
	public void onMutePush(TV tv) {
		System.out.println("mute on");
		tv.setState2(new MuteON());
	}

	@Override
	public void offMutePush(TV tv) {
		System.out.println("mute off");
		tv.setState2(new MuteOFF());
	}

}
