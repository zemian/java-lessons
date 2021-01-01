package zemian.commontasks.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public List<EventListener> listeners = new ArrayList<>();

    public void registerEventListener(EventListener listener) {
        this.listeners.add(listener);
    }

    public void sendEvent(Event event) {
        for(EventListener listener : listeners) {
            listener.handle(event);
        }
    }

    public void start() {
        System.out.println("Application is tarting. will notify listeners");
        sendEvent(new Event("start"));
    }

    public void stop() {
        System.out.println("Application is tarting. will notify listeners");
        sendEvent(new Event("stop"));
    }
}
