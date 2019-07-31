package bridge_pattern;

//기능 클래스 계층
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {
		open(); // DisplayImpl의  rawOpen을 부름
		for (int i = 0; i < times; i++) { // times회 반복해서 표시한다
			print(); // DisplayImpl의  rawPrint을 부름
		}
		close(); // DisplayImpl의  rawClose을 부름
	}

}