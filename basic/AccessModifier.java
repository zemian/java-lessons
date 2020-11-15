/**
 * AccessModifier - control how a type, properties and methods are allowed to access by caller.
 *
 * Java classes can have modifier keywords when defining them. These will affect
 * how other classes can access or inherit the members.
 *
 * Main focus:
 * - Four access modifier: public, private protected, default (no keyword)
 *
 * Extra Ref:
 * - https://www.geeksforgeeks.org/access-modifiers-java/
 *
 * Further study:
 * - https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * - Review how package work again and see how access modifier affects it
 * - Learn about "default" access modifier
 */

import accessmodifiers.*;
public class AccessModifier {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color); // OK
//        System.out.println(car.vin);   // ERROR - private

        Truck truck = new Truck("Red", 10_000);
//        System.out.println(truck.price); // ERROR - protected
        System.out.println(truck.calculatePrice());
    }
}
