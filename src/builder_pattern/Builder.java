package builder_pattern;

public abstract class Builder {

	public abstract void makeHeader(String title);

	public abstract void makeBody(String body);

	public abstract void makeFooter(String tail);

	public abstract String getResult();

}
