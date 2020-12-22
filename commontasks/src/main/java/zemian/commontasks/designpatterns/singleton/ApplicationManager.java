package zemian.commontasks.designpatterns.singleton;

public class ApplicationManager {
    static private ApplicationManager instance = new ApplicationManager();
    private ApplicationManager() {
        // Alternative option to instantiate object is in constructor
        // This gives better stack trace if something happens!
        //this.instance = new ApplicationManager();
    }

    public static ApplicationManager getInstance() {
        return instance;
    }

    // Now you can store singleton related properties here
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void updateScore(int points) {
        score = points * 5;
    }
}
