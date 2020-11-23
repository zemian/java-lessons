package eventlistener;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventListener listener1 = new EventListener() {
            @Override
            public void handle(Event event) {
                if (event.args.get(0).equals("game start")) {
                    System.out.println("Got an event" + event.args);
                }

                // This is odd pattern??
                event.setArgs(List.of("player died"));
            }
        };

        // Consumer, Listener, Receiver handlers
        Consumer consumer = new Consumer();
        consumer.registerEventListener(listener1);
        consumer.registerEventListener((event) -> {
            System.out.println("Got another event " + event);
        });


        // Producer, Event Generator, Provider
        Producer p = new Producer(consumer);
        p.sendEvent(new Event());
        p.sendEvent(new Event(List.of("game start")));

        Event event3 = new Event();
        event3.setArgs(List.of("player died"));
        p.sendEvent(event3);
    }
}
