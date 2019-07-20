package composite_pattern_2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

	private List<Component> files = new ArrayList<Component>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void print() {
		for (int i = 0; i < getDepth(); i++) {
			System.out.println("\t");
		}
		System.out.println("[Directory] " + getName() + ", Size: " + getSize());

		for (Component entry : files) {
			entry.print();
		}
	}

	@Override
	public int getSize() {

		int totalSize = 0;

		for (Component entry : files) {
			totalSize += entry.getSize();
		}

		return totalSize;
	}

	public void addEntry(Component entry) {
		entry.setDepth(getDepth() + 1);
		files.add(entry);
	}

	public void removeEntry(Component entry) {
		files.remove(entry);
	}

}
