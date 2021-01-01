package zemian.commontasks.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        ApplicationManager app = ApplicationManager.getInstance();
        System.out.println("Score " + app.getScore());
        app.updateScore(99);
        System.out.println("Score after update " + app.getScore());
    }
}
