package templatemethod_pattern;

public class Main {

	public static void main(String[] args) {

		PagePrinter pp = new MyPagePrinter();
		pp.print(10, "DesignPatttern ");
		
		System.out.println("=============================");
		
		PagePrinter pp2 = new YourPagePrinter();
		pp2.print(20, "hororororororok");
	}

}
