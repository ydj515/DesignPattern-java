package state_pattern_2;

public class Main {
	public static void main(String[] args) {

		TV tv = new TV();
		
		tv.offPower();
		tv.offMute();
		System.out.println();
		
		tv.offPower();
		tv.onMute();
		System.out.println();
		
		tv.onPower();
		tv.onMute();
		System.out.println();
		
		tv.onPower();
		tv.onMute();
		System.out.println();
	}

}
