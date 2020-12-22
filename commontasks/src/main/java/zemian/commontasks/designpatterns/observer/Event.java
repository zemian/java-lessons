package zemian.commontasks.designpatterns.observer;

// The subject to be observed
public class Event {
    String name;

    public Event() {
    }

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                '}';
    }
}
