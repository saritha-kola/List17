
public class Main {
	public static void main(String[] args) {

		Computer c = new Computer();
		Laptop l = new Laptop();
		StationaryComputer sc = new StationaryComputer();

		c.turnon();
		c.playMusic();
		c.turnoff();

		l.turnon();
		l.playVideo();
		l.turnoff();

		sc.turnon();
		sc.performUpload();
		sc.turnoff();

	}
}
