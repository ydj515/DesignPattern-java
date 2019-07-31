package bridge_pattern;

//구현 클래스 계층
public class StringDisplayImpl extends DisplayImpl {

	private String string; // 표시해야 할 문자열
	private int width; // 바이트 단위로 계산할 문자열의 '길이'

	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();

	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
