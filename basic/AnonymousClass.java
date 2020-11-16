/*
 * We can create a new anonymous sub type and instantiate it at the same time!
 *
 * Main focus:
 * - You can do this with any class type that you need subclass with.
 * - This is often needed when we want to provide a quick instance of an interface.
 * - The anonymous sub type assignment statement!
 */

public class AnonymousClass {
    public static void main(String[] args) {
        //  Create a sub class of Car and override one of the method
        Car truck = new Car("RED") {
            public String getFancyColor() {
                return "Fancy truck " + this.color;
            }
        };
        System.out.println(truck.getFancyColor());

        // Create anonymous instance of Engine interface
        Engine engine = new Engine() {

            @Override
            public void start() {
                System.out.println("Starting engine");
            }

            @Override
            public void stop() {
                System.out.println("Stopping engine");
            }
        };
        engine.start();
        engine.stop();

        // Create an instance of a Runnable object (anonymous sub-class instance)
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("I am inside a anonymous runnable class.");
            }
        };
        task.run();

        // Another example by creating anonymous Comparator instance
        java.util.Comparator<Integer> comp = new java.util.Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // sort descending order
            }
        };
        Integer[] numbers = {7, 2, 1, 8, 9};
        java.util.Arrays.sort(numbers, comp);
        System.out.println(java.util.Arrays.asList(numbers));

        // Simple anonymous class that has only one method can be replace by lambda directly!
        Integer[] numbers2 = {5, 6, 3, 8, 1, 2};
        java.util.Arrays.sort(numbers2, (a, b) -> b - a);
        System.out.println(java.util.Arrays.asList(numbers2));
    }

    public static class Car {
        public String color;
        public Car(String color) {
            this.color = color;
        }
        public String getFancyColor() {
            return "Fancy car " + this.color;
        }
    }

    public interface Engine {
        void start();
        void stop();
    }
}
