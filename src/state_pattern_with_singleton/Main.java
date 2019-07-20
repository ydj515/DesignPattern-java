package state_pattern_with_singleton;


public class Main {

	public static void main(String[] args) {

		Light light = new Light();
		
		light.switchOn();
		light.switchOff();
		light.switchOff();
	}

}
