package designpatterns.eventlistener;

import java.util.List;

public class Consumer {
    public List<EventListener> listeners;
    public void registerEventListener(EventListener listener) {
        this.listeners.add(listener);
    }
}
