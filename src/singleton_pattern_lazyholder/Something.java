package singleton_pattern_lazyholder;


public class Something {

	private Something() {

	}

	private static class LazyHolder { // getInstance() 호출시 class & 로딩 초기화
		public static final Something INSTANCE = new Something(); // final Ű����� ��� ó��
	}

	public static Something getInstance() {
		return LazyHolder.INSTANCE; // 참조하는 순간 class가 로딩되고 초기화 진행
	}

}
