package zemian.commontasks.jul;

import java.util.List;
import java.util.logging.Logger;

public class Game {
    static Logger LOG = Logger.getLogger(Game.class.getName());
    private List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
    }

    public void start() {
        LOG.fine("Game is starting");
        for (Player p : players)
            p.initProfile();
    }
}
