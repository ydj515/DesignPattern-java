package state_pattern_with_singleton;

public class On implements State {

	// singleton pattern을 같이 이용하였다
	
	private static On on = new On(); // On 클래스의 인스턴스로 초기화됨

	private On() {

	}

	public static On getInstatnce() { // 초기화된 On 클래스의 인스턴스를 반환함
		return on;
	}

	@Override
	public void onButtonPush(Light light) { // On 상태에서 On button을 눌러도 변화 없음
		System.out.println("staying");
	}

	@Override
	public void offButtonPush(Light light) {
		System.out.println("switch off");
		light.setState(Off.getInstatnce());
	}
}
