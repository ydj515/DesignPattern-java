package state_pattern_1;

public class Off implements State {

	@Override
	public void onButtonPush(Light light) {
		System.out.println("switch on");
		light.setState(new On()); // 이 부분을 new 해주지 않고 singleton을 이용할 수 있다.
	}

	@Override
	public void offButtonPush(Light light) { // Off 상태에서 Off button을 눌러도 변화 없음
		System.out.println("staying");
	}
}
