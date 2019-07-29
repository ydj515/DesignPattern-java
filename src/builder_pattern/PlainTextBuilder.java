package builder_pattern;

public class PlainTextBuilder extends Builder {

	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeHeader(String title) {
		sb.append(title).append("\n");
	}

	@Override
	public void makeBody(String body) {
		sb.append(body).append("\n");
	}

	@Override
	public void makeFooter(String footer) {
		sb.append(footer).append("\n");
	}

	public String getResult() {
		return sb.toString();
	}

}
