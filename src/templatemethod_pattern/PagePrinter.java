package templatemethod_pattern;

public abstract class PagePrinter {

	public void print(int page, String content) {

		printHeader();
		printContent(content);
		printFooter();

		if (wantPageNum()) {
			System.out.println(page);
		}

		System.out.println("*************");
		System.out.println(content);
		System.out.println("*************");
		System.out.println(page);
	}

	protected abstract boolean wantPageNum();

	protected abstract void printFooter();

	protected abstract void printContent(String content);

	protected abstract void printHeader();

}
