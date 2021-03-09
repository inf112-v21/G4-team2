package inf112.skeleton.app;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import inf112.skeleton.app.player.AbstractPlayer;
import inf112.skeleton.app.player.Player;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Sets up gdx to create a new game of RoboRally.
 */
public class RoboRally {
    private final static int nrOfPlayers = 1; // Pre-determined number of players
    private final Queue<AbstractPlayer> players = new LinkedList<>();

    public RoboRally() {
        Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
        cfg.setTitle("RoboRally");
        cfg.setWindowedMode(1000, 1000);
        cfg.disableAudio(true);

        addPlayers(nrOfPlayers);


        Board board = new Board(players);

        // Initializes game window
        new Lwjgl3Application(board, cfg);
    }

    /**
     *
     * @param nrOfPlayers
     */
    public void addPlayers(int nrOfPlayers) {
        for (int i = 0; i < nrOfPlayers; i++) {
            players.add(new Player(new Location(0,0)));
        }
    }


}

