package state_pattern_1;

public class On implements State {

	@Override
	public void onButtonPush(Light light) { // On 상태에서 On button을 눌러도 변화 없음
		System.out.println("staying");
	}

	@Override
	public void offButtonPush(Light light) {
		System.out.println("switch off");
		light.setState(new Off()); // 이 부분을 new 해주지 않고 singleton을 이용할 수 있다.
	}
}
