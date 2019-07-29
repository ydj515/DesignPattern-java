package builder_pattern;

public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void make() {
		builder.makeHeader("header 입니다.");
		builder.makeBody("body 내용입니다.");
		builder.makeFooter("footer 입니다.");
	}

	public String getReslt() {
		return builder.getResult();
	}
}
