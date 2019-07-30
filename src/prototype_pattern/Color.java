package prototype_pattern;

abstract public class Color implements Cloneable {
	
	protected String colorName;

	public void addColor() {
		System.out.println(colorName + " color added"); 
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}