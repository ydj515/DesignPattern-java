package facade_pattern;

public class Facade {
	
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Screen screen;
	private Projector projector;

	public Facade() {
		dvdPlayer = new DvdPlayer();
		cdPlayer = new CdPlayer();
		screen = new Screen();
		projector = new Projector();
	}

	public void turnOnOperationTvMode() {
		screen.down();
		projector.tvMode();
		cdPlayer.stop();
		dvdPlayer.play();
	}

	public void turnOffOperationWideScreen() {
		screen.up();
		projector.wideScreenMode();
		cdPlayer.play();
		dvdPlayer.stop();
	}

}
