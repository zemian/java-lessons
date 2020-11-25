package designpatterns.eventlistener;

public class Producer {
    public Consumer consumer;
    public Producer(Consumer consumer) {
        this.consumer = consumer;
    }
    public void sendEvent(Event event) {
        for(EventListener listener : consumer.listeners) {
            listener.handle(event);
        }
    }
}
