package flyweight_pattern_1;

public class Main {

	public static void main(String[] args) {
		
		// 자바의 string도 flyweight 패턴 이용
		String s = "hello";
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println("s == s1 ? " + (s == s1));
		System.out.println("s == s2 ? " + (s == s2));
	}

}
