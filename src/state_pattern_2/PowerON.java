package state_pattern_2;

public class PowerON implements State {

	@Override
	public void onButtonPush(TV tv) {
		System.out.println("그대로");
	}

	@Override
	public void offButtonPush(TV tv) {
		System.out.println("tv off");
		tv.setState1(new PowerOFF());
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
