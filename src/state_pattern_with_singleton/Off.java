package state_pattern_with_singleton;

public class Off implements State {

	// singleton pattern을 같이 이용하였다
	
	private static Off off = new Off(); // Off 클래스의 인스턴스로 초기화됨

	private Off() {

	}

	public static Off getInstatnce() { // 초기화된 Off 클래스의 인스턴스를 반환함
		return off;
	}

	@Override
	public void onButtonPush(Light light) {
		System.out.println("switch on");
		light.setState(On.getInstatnce());
	}

	@Override
	public void offButtonPush(Light light) { // Off 상태에서 Off button을 눌러도 변화 없음
		System.out.println("staying");
	}
}
