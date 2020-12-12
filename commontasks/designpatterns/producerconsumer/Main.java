package designpatterns.producerconsumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Application app = new Application();
        app.addConsumer(data -> {
            System.out.println("Data consumer #1 is processing...");
            System.out.println("Data is crunchy.");
        });
        app.addConsumer(data -> {
            System.out.println("Data consumer #2 is processing...");
            System.out.println("Data is yucky.");
        });
        app.addConsumer(data -> {
            System.out.println("Data consumer #3 is processing...");
            System.out.println("Data is yummy.");
        });

        app.start();

        Producer producer = new DataProducer();
        for (int i = 0; i < 10; i++) {
            Data data = producer.generateData();
            System.out.println("Sending data to queue " + data);
            app.queueData(data);

            long pause = (long)(Math.random() * 300);
            Thread.sleep(pause);
        }

        Thread.sleep(1000); // Give consumers enough time to drain all data before shutdown
        app.stop();
    }
}
