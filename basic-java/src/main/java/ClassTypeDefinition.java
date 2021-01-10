/*
Class Type Definition

A real usage of Class to create custom user type and better organizing of your code.
A custom class allow us to not just group functions together (also called methods)
but we group them in such way that they are used to manipulate some member
variables (data) inside the class. When you create a new instance (called object in
general) from a Class, the instance will have their own copy of these member variables
and hence hold "states" and values specific to a instance. Organizing your code this
way is called Object Oriented design.

Main focus:
- A type definition is a template to create new instance
- A type has a name, properties and methods.
- A type does not use "static"!
- Learn to use "this" for the instance access
- Learn to create constructor to create instance with "new" keyword

Further study:
- Compare OO to functional programming design
- Learn more about primitive wrapper classes and their functions/methods you can use
- Learn more about static keyword usage
- Learn about method override vs overloading
- Learn about java.lang.Object and it's methods
- Learn about member default value
- Learn what getter and setter methods are
- What is polymorphism: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html

Exercise:
- Create a class nemd "Location" that contains x and y coordinate.
    * Add getter and setters for x and y
    * Add toString() to print x and y
    * Add a method to calculate distance beween this and another Location

- Create a class named "Player" that provide the following, you thik about what types 
  you should be using for these members:
    * A score value
    * A number of life left
    * A list of friends (other players)
    * A location position (Location)
    * A method that takes direction as parameter and then increase/decrease the x or y coordinates
 */

public class ClassTypeDefinition {
    public static void main(String[] args) {
        // Explore an built-in Class: Integer (or java.lang.Integer)

        // Create a new instance of a class
        Integer num = new Integer(127);
        System.out.println(num.toString());

        // Use their method specific to this instance
        byte numByte = num.byteValue();
        System.out.println(numByte);

        // Create multiple instances
        Integer[] numArray = {new Integer(7), new Integer(8), new Integer(9)};
        System.out.println(numArray[0].byteValue());
        System.out.println(numArray[1].byteValue());
        System.out.println(numArray[2].byteValue());

        // Now try custom class: Car
        Car car = new Car();
        System.out.println(car.color); // Access direct property
        System.out.println(car.getDescription()); // Access method

        // Create another instance of same type but hold different value
        Car car2 = new Car("Red");
        System.out.println(car2.getDescription());

        // Use Getter and Setter
        System.out.println(car.getColor());
        car.setColor("GREEN");
        System.out.println(car.getColor());

        // We can create array of custom type as well
        Car[] cars = {new Car("Yellow"), new Car("Blue"), new Car("Green")};
        System.out.println(cars[0].getDescription());
        System.out.println(cars[1].getDescription());
        System.out.println(cars[2].getDescription());

        // Now modify one instance of the car
        cars[0].changeColor("Orange");
        System.out.println(cars[0].getDescription()); // Changed!
        System.out.println(cars[1].getDescription()); // Unchanged
        System.out.println(cars[2].getDescription()); // Unchanged

        // Use constant
        Car car3 = new Car(Car.DEFAULT_COLOR);
        System.out.println(car3);
    }

    // Class definition - keep in mind that you are writing the type declaration
    //                    (template for each instance object)
    public static class Car {
        // Notice that we no longer use "static" keyword for the rest of the class definition!
        public String color;

        // You can define constant
        public static String DEFAULT_COLOR = "Gray";

        // == Constructor methods to populate property
        // Default constructor
        public Car() {
        }

        // Using a Constructor to accept argument to the instance
        public Car(String color) {
            // Notice the usage of "this", which means the "instance" that you are working on.
            this.color = color;
        }

        // == Member methods to manipulate property
        public String getDescription() {
            return "My car color is " + this.color;
        }

        public void changeColor(String newColor) {
            this.color = newColor;
        }

        // == Better Member methods with Getter/Setter
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // == Magic methods for System.out.println() to print nicely
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
