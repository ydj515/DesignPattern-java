package composite_pattern_1;

public class Triangle extends Component {

	private double width;
	private double height;

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double size() {
		return 0.5 * width * height;
	}

	@Override
	public void addComponent(Component component) {

	}

}
