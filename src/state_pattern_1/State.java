package state_pattern_1;

public interface State {

	public void onButtonPush(Light light);

	public void offButtonPush(Light light);

}
