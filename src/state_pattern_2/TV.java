package state_pattern_2;

public class TV {

	State st1;
	State st2;

	public TV() {
		st1 = new PowerOFF();
		st2 = new MuteOFF();
	}

	public void setState1(State st1) {
		this.st1 = st1;
	}

	public void setState2(State st2) {
		this.st2 = st2;
	}

	public void onPower() {
		st1.onButtonPush(this);
	}

	public void offPower() {
		st1.offButtonPush(this);
	}

	public void onMute() {
		st2.onMutePush(this);
	}

	public void offMute() {
		st2.offMutePush(this);
	}
}
