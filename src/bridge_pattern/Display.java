package bridge_pattern;

//기능 클래스 계층
public class Display {

	// impl 필드는 Display 구현을 나타내는 인스턴스 입니다.
	// 이 필드가 두 클래스 계층의 '다리'가 됩니다.
	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}

}
