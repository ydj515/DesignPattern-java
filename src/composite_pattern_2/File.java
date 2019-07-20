package composite_pattern_2;

public class File extends Component {

	private int size;

	public File(String name, int size) {
		super(name);
		this.size = size;
	}

	@Override
	public void print() {
		for (int i = 0; i < getDepth(); i++) {
			System.out.println("\t");
		}
		System.out.println("[File] " + getName() + ", Size: " + size);
	}

	@Override
	public int getSize() {
		return size;
	}

}
