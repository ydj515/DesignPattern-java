package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
	private static Map<String, Color> colorMap = new HashMap<String, Color>();

	static {
		colorMap.put("blue", new BlueColor());
		colorMap.put("red", new RedColor());
	}

	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}

}
