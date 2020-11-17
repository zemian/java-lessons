/*
Interface is a empty class type (contract) that a concrete class must implement.

Main focus:
- Class can implements multiple interfaces!
- All methods must be provided by implementation class
- You can not create new instance with interface
- Interface can not hold member properties, but only constants
- Interface is like parent class that can support polymorphism
 */

import java.util.*;

public class Interface {
    public static void main(String[] args) {
        // Create normal instances
        Car car = new Car();
        car.start();
        car.stop();

        Boat boat = new Boat();
        boat.start();
        boat.stop();

        // Interface can use to hold instance!
        Engine carEngine = new Car();
        carEngine.start();
        carEngine.stop();
        Engine boatEngine = new Boat();
        boatEngine.start();
        boatEngine.stop();

        // Example of polymorphism
        Engine coolEngine = createEngine("car");
        coolEngine.start();
        coolEngine.stop();

        // Another example usage of interface
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
    }

    public static Engine createEngine(String type) {
        if (type.equals("car")) {
            return new Car();
        } else {
            return new Boat();
        }
    }

    // NOTE: static and public are redundant for interface.
    public static interface Engine {
        public void start();
        public void stop();
    }

    public static class Car implements Engine {

        @Override
        public void start() {
            System.out.println("Starting car");
        }

        @Override
        public void stop() {
            System.out.println("Stopping car");
        }
    }

    public static class Boat implements Engine {

        @Override
        public void start() {
            System.out.println("Starting car");
        }

        @Override
        public void stop() {
            System.out.println("Stopping car");
        }
    }
}
