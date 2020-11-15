/**
 * Abstract class is just a parent class but allow some empty methods.
 *
 * Main focus:
 * - Class can only extends one abstract class as parent
 * - You can not create new instance with abstract class
 * - All methods must be provided by subclass
 * - Abstract class can hold member properties
 */
public class AbstractClass {
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
    }

    public static Engine createEngine(String type) {
        if (type.equals("car")) {
            return new Car();
        } else {
            return new Boat();
        }
    }

    // NOTE: static and public are redundant for interface.
    abstract public static class Engine {
        public int horsePower;

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        abstract public void start();
        abstract public void stop();
    }

    public static class Car extends Engine {

        @Override
        public void start() {
            System.out.println("Starting car");
        }

        @Override
        public void stop() {
            System.out.println("Stopping car");
        }
    }

    public static class Boat extends Engine {

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
