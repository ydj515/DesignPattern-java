package composite_pattern_1;

public class Rect extends Component {

	private double width;
	private double height;

	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double size() {
		return width * height;
	}

	@Override
	public void addComponent(Component component) {

	}

}
