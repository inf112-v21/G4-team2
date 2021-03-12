package inf112.skeleton.app.player;

import inf112.skeleton.app.Location;

/**
 * This class is used to test the player
 */

public class TestPlayer extends AbstractPlayer  {
    private Location location;

    public TestPlayer(Location location) {
        super(location, 1);
    }

    public TestPlayer(Location location, int index) {
        super(location, index);
    }

    public void printHand() {
        for (int i = 0; i < getHand().size(); i++) {
            System.out.println((i + 1) + ": " + getHand().get(i).getCardValue());
        }
    }
}
