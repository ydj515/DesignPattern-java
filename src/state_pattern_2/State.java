package state_pattern_2;

public interface State {

	public void onButtonPush(TV tv);

	public void offButtonPush(TV tv);

	public void onMutePush(TV tv);

	public void offMutePush(TV tv);

}
