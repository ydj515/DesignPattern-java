package builder_pattern;

public class HtmlBuilder extends Builder {

	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeHeader(String title) {
		sb.append("<html>\n");
		sb.append("<header>\n");
		sb.append(title).append("\n");
		sb.append("</header>\n");
	}

	@Override
	public void makeBody(String body) {
		sb.append("<body>\n");
		sb.append(body).append("\n");
		sb.append("</body>\n");
	}

	@Override
	public void makeFooter(String footer) {
		sb.append("<footer>\n");
		sb.append(footer).append("\n");
		sb.append("</footer>\n");
		sb.append("</html>\n");
		
	}

	public String getResult() {
		return sb.toString();
	}

}
