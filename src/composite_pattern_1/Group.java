package composite_pattern_1;

import java.util.List;
import java.util.ArrayList;

public class Group extends Component {

	private List<Component> itsComponents = new ArrayList<Component>();

	public void addComponent(Component component) {
		itsComponents.add(component);
	}

	@Override
	public double size() { // 도형들의 사이즈 합을 누적

		double totalSize = 0.0;

		for (Component component : itsComponents) {
			totalSize += component.size();
		}

		return totalSize;
	}

}
