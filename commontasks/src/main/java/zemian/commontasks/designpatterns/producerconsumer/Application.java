package zemian.commontasks.designpatterns.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Application implements Runnable {
    volatile boolean running = false;
    ArrayBlockingQueue<Data> queue = new ArrayBlockingQueue<>(100);
    List<Consumer> consumers = new ArrayList<>();

    public void addConsumer(Consumer consumer) {
        this.consumers.add(consumer);
    }

    public void queueData(Data data) {
        queue.offer(data);
    }

    public void processDataByConsumers(Data data) {
        System.out.println("Processing data by all consumers...");
        for (Consumer consumer : consumers) {
            consumer.processData(data);
        }
    }

    @Override
    public void run() {
        while (this.running) {
            try {
                // Note that queue.poll() will block thread if there is no data!
                // Note if you use queue.take() instead, then this run won't exit!
                Data data = this.queue.poll(500, TimeUnit.MILLISECONDS);
                processDataByConsumers(data);
            } catch (InterruptedException e) {
                throw new RuntimeException("Unable to get data from queue", e);
            }
        }
    }

    public void start() {
        this.running = true;
        new Thread(this).start();
    }

    public void stop() {
        this.running = false;
    }
}
