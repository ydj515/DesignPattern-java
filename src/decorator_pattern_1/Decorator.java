package decorator_pattern_1;

public abstract class Decorator extends Display {

	private Display display;

	public Decorator(Display display) {
		this.display = display;
	}

	@Override
	public void draw() {
		display.draw();
	}

}
