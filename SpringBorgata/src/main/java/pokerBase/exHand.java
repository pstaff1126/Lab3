package pokerBase;

public class exHand extends Exception {
	public exHand(Hand h) {
		super("At least two hands are tied");
	}

}
