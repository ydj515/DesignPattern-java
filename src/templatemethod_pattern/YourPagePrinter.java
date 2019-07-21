package templatemethod_pattern;

public class YourPagePrinter extends PagePrinter {

	@Override
	protected boolean wantPageNum() {
		return true;
	}

	@Override
	protected void printFooter() {
		System.out.println("@@@@@@@@@@@@@@@@@@");
	}

	@Override
	protected void printContent(String content) {

	}

	@Override
	protected void printHeader() {
		System.out.println("@@@@@@@@@@@@@@@@@@");
	}

}
