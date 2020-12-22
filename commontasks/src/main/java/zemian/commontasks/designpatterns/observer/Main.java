package zemian.commontasks.designpatterns.observer;

// Observer or EventListener pattern.
public class Main {
    public static void main(String[] args) {
        Application app = new Application();

        app.registerEventListener(event -> {
            if (event.getName().equals("start")) {
                System.out.println("Welcome to our fancy app.");
            }
        });

        app.registerEventListener(event -> {
            if (event.getName().equals("stop")) {
                System.out.println("Good bye my friend.");
            }
        });

        app.start();
        app.stop();
    }
}
