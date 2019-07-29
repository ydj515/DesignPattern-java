package builder_pattern;

public class Main {

	public static void main(String[] args) {

		Director director1 = new Director(new PlainTextBuilder());
		director1.make();
		String result1 = director1.getReslt();
		System.out.println(result1);

		System.out.println("=======================================");
		
		Director director2 = new Director(new HtmlBuilder());
		director2.make();
		String result2 = director2.getReslt();
		System.out.println(result2);

	}

}
