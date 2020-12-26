package zemian.commontasks.jul;

import java.util.List;
import java.util.logging.Logger;

public class GameMain {
    public static Logger LOG = Logger.getLogger(GameMain.class.getName());

    public static void main(String[] args) {
        LOG.info("Main program is starting");
        new GameMain().run();
    }

    private void run() {
        Game game = new Game(List.of(new Player("one")));
        game.start();
    }
}
