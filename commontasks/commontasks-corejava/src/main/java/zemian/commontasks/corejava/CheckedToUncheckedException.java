package zemian.commontasks.corejava;

public class CheckedToUncheckedException {
    public static void main(String[] args) {
        sleep(1000); // It's optional to use 'L' suffix!
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to sleep full " + millis + " millis seconds.", e);
        }
    }
}
