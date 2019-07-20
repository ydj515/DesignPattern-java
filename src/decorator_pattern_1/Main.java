package decorator_pattern_1;

public class Main {

	public static void main(String[] args) {

		Display roadDisplay = new RoadDisplay();
		roadDisplay.draw();
		
		Display laneDeco = new LaneDecorator(roadDisplay);
		laneDeco.draw();
		
		Display trafficDeco = new TrafficDecorator(laneDeco);
		trafficDeco.draw();
		
		Display weatherDeco = new WeatherDecorator(trafficDeco);
		weatherDeco.draw();
		
	}

}
