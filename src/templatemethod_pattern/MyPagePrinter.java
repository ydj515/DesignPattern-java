package templatemethod_pattern;

public class MyPagePrinter extends PagePrinter {

	@Override
	protected boolean wantPageNum() {
		return false;
	}

	@Override
	protected void printFooter() {
		System.out.println("###################");
	}

	@Override
	protected void printContent(String content) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void printHeader() {
		System.out.println("###################");
	}

}
