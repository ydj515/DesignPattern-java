package singleton_pattern_ex;


public class Main {

	public static void main(String[] args) {

		Member m1 = new Member();
		
		m1.setLevel(new Oridinary());
		m1.setLevel(new Good());
		
		Member m2 = new Member();
		m2.setLevel(new Vip());
		m2.setLevel(new Oridinary());
	}

}
