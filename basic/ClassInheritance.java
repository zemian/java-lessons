/*
Class definition can extend other class so that we can reuse code more effectively

Main focus:
- Reuse code by inheriting from a base class
- Only one parent class is allowed
- Default parent class is java.lang.Object
- Add common properties and methods in parent class
- Add extra properties and/or methods to sub-class
- Override methods, not properties

Further study:
- A Class can only extend ONE parent class
- Learn what class encapsulation mean
- Learn to override equals() and hashCode() for custom used by HashMap key
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

        // Type assignment with inheritance - Parent can store Children
        // But you can only invoke methods that defined in the parent class!
        Car car2 = new Truck("Blue", 100_000);
        System.out.println(car2);

        // In fact you can use Object to hold any object
        Object car3 = new Truck("Yellow", 99_123);
        System.out.println(car3);

        // Type casting
        // You can convert the parent object back to subclass - if you know for sure it's that's type
        // we call this explicit casting
        Truck truck3 = (Truck) car3;
        System.out.println(truck3);

        // Instance type check
        if (car3 instanceof Car) {
            System.out.println("car3 is a Car");
        }

        // Get type name from an object
        System.out.println(car3.getClass());
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
