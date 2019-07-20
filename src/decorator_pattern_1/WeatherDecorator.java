package decorator_pattern_1;

public class WeatherDecorator extends Decorator {

	public WeatherDecorator(Display display) {
		super(display);
	}
	
	public void draw() {
		super.draw();
		System.out.println("\tweather");
	}

}
