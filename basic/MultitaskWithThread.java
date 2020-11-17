/*
 * Java let you run code in parallel using Thread. This allow you to multitasking
 * and speed up certain type of operations.
 *
 * Main focus:
 * - Show how two threads can start
 * - Show how to add custom code to the run per Thread
 *
 * Further study:
 * - Learn how to synchronize code to prevent data corruption
 * - Learn about thread pool
 */

import java.util.Date;

public class MultitaskWithThread {
    public static void main(String[] args) {

        // Create a new thread that can run some code using a java.lang.Runnable interface
        Thread task1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 10;
                while (--count > 0) {
                    System.out.println(new Date() + "Task 1 is running");
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Failed to sleep");
                    }
                }
            }
        });

        // Create another task but using lambda to implements Runnable
        Thread task2 = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                System.out.println(new Date() + "Task 2 is running");
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Failed to sleep");
                }
            }
        });

        // Now start the threads and let them run concurrently
        task1.start();
        task2.start();
    }
}
