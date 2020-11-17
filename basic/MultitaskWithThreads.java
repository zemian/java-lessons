/*
 * Java let you run code in parallel using Thread. This allow you to multitasking
 * and speed up certain type of operations.
 *
 * Main focus:
 * - How two threads can start
 * - How to add custom code to the run per Thread
 * - How to synchronized keyword to prevent data corruption
 *
 * Further study:
 * - Do not use deprecated Thread.start()/Thread.stop()
 * - Learn how you can control the stopping of a running thread
 * - You can synchronized on a object instance!
 * - Explore volatile keyword and compare to synchronized
 * - Learn about thread pool
 * - Learn more about "java.util.concurrent" package
 */

import java.util.Date;

public class MultitaskWithThreads {
    public static void main(String[] args) {

        // Topic1: Running multiple threads concurrently
        // Create two Thread objects that can run some code using a java.lang.Runnable interface
        Thread task1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 10;
                while (--count > 0) {
                    System.out.println(new Date() + " Task 1 is running");
                    pause(300L);
                }
            }
        });

        // Create another task but using lambda to implements Runnable
        Thread task2 = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                System.out.println(new Date() + " Task 2 is running");
                pause(300L);
            }
        });

        // Now start the threads and let them run concurrently
        task1.start();
        task2.start();

        //
        // Topic2:
        // Using "synchronized" keyword to protect share data example
        //
        MySharedData sharedData = new MySharedData();
        Thread task3 = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                System.out.println(new Date() + " Updating shared data: " + sharedData.getCounter());
                sharedData.add(10);
                pause(300L);
            }
        });
        Thread task4 = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                System.out.println(new Date() + " Updating shared data: " + sharedData.getCounter());
                sharedData.add(5);
                pause(300L);
            }
        });
        task3.start();
        task4.start();
    }

    public static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to sleep");
        }
    }

    public static class MySharedData {
        private int counter = 0;

        public int getCounter() {
            return counter;
        }

        synchronized public void add(int value) {
            this.counter = this.counter + value;
        }
    }
}
