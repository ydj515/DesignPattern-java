package state_pattern_with_singleton;

public interface State {

	public void onButtonPush(Light light);

	public void offButtonPush(Light light);

}
