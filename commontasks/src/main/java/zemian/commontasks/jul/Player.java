package zemian.commontasks.jul;

import java.util.logging.Logger;

public class Player {
    public static Logger LOG = Logger.getLogger(Player.class.getName());

    private String name;

    public Player(String name) {
        this.name = name;
    }
    public void initProfile() {
        LOG.info("Player " + name + " profile is ready.");
    }
}
