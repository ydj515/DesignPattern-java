package decorator_pattern_1;

public class TrafficDecorator extends Decorator {

	public TrafficDecorator(Display display) {
		super(display);
	}
	
	public void draw() {
		super.draw();
		System.out.println("\ttraffic");
	}

}
