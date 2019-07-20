package state_pattern_with_singleton;

public class Light {

	private State state;

	public Light() {
		state = Off.getInstatnce(); // 초기 상태는 off인 상태
	}

	public void setState(State state) {
		this.state = state;
	}

	public void switchOn() {
		state.onButtonPush(this);
	}

	public void switchOff() {
		state.offButtonPush(this);
	}

}
