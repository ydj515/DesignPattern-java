package composite_pattern_2;

public class Main {

	public static void main(String[] args) {

		Directory dir1 = new Directory("root");
		Directory dir2 = new Directory("Dir1");

		File f1 = new File("f1", 100);
		File f2 = new File("f2", 100);
		File f3 = new File("f3", 100);
		File f4 = new File("f4", 100);

		dir1.addEntry(f1);
		dir1.addEntry(dir2);
		dir2.addEntry(f2);
		dir2.addEntry(f3);
		dir1.addEntry(f4);
		System.out.println("==================================");
		
		dir1.print();
		System.out.println("==================================");
		dir2.print();
		System.out.println("==================================");
	}

}
