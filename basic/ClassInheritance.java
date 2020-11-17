/*
 * Class definition can extend other class so that we can reuse code more effectively
 *
 * Main focus:
 * - Reuse code by inheriting from a base class
 * - Only one parent class is allowed
 * - Default parent class is java.lang.Object
 * - Add common properties and methods in parent class
 * - Add extra properties and/or methods to sub-class
 * - Override methods, not properties
 *
 * Further study:
 * - A Class can only extend ONE parent class
 * - Learn what class encapsulation mean
 * - Learn to override equals() and hashCode() for custom used by HashMap key
 */
public class ClassInheritance {
    public static void main(String[] args) {
        Truck truck = new Truck("Red", 10_000);
        System.out.println(truck.getSalesDescription());
        System.out.println(truck.getNumOfWheels());

        // We can also use parent class to store sub-class instance
        Car car = new Truck("Red", 10_000);
        System.out.println(car.getSalesDescription());
        // Note can no longer can call this since Car class does not have this method!
        //System.out.println(car.getNumOfWheels()); // Error
    }

    public static class Car extends Object {
        public String color;
        public int numOfWheels = 18;

        // Default constructor
        public Car() {
            this.color = "Gray";
        }
        // Extra constructor - if exist, you must give default constructor explicitly
        public Car(String color) {
            this.color = color;
        }

        public void changeColor(String newColor) {
            this.color = newColor;
        }

        public String getSalesDescription() {
            return "My car color is " + this.color;
        }

        public int getNumOfWheels() {
            return this.numOfWheels;
        }

        // Getter / Setter
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static class Truck extends Car {
        public int truckBedCapacity;

        public Truck(String color, int truckBedCapabicity) {
            // We must call parent constructor since it has argument
            super(color);

            this.truckBedCapacity = truckBedCapabicity;
        }

        // Override method - notice we use a special "Annotation" to clarify code.
        public String getSalesDescription() {
            return "My truck color is " + this.color + " with " +
                    this.truckBedCapacity + " tons capacity.";
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "loadCapacityInTon=" + truckBedCapacity +
                    ", numOfWheels=" + numOfWheels +
                    '}';
        }
    }
}
