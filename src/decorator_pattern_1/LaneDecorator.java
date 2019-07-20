package decorator_pattern_1;

public class LaneDecorator extends Decorator {

	public LaneDecorator(Display display) {
		super(display);
	}

	public void draw() {
		super.draw();
		System.out.println("\tlane");
	}

}
