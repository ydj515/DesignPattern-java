package composite_pattern_2;

public abstract class Component {

	private String name;
	private int depth = 0;

	public Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public abstract int getSize();

	public abstract void print();
}
