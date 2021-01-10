/*
Enum is a special class type that use to defined strong type constants.

Main focus:
- Simple enum that has ordinal id and string constant.
- Custom enum that we define our own data.
- You can not extends enum type!

Exercise:
- Create an enum class of 3 different Minecraft block types.
- Create an enum class of play card Suite: Diamon, Club, Heart and Spade
- Create an class named Card that has following:
    * Suite (enum)
    * faceValue (2-10, Jack, Queen, King or Ace)
    * toString method
- Create a class named Deck that has the following:
    * List of 52 Card
    * A method: "shuffe" that randomize teh cards in the list
    * A method named "dealHand(int numberCards)" and print the numberCards values on Console.
 */

import java.util.*;
import enumtype.MyColor;
import static enumtype.MyColor.*;

public class EnumType {
    public static void main(String[] args) {
        // Using simple enum
        Color color = Color.RED;
        System.out.println(color);

        // You can access any constants
        System.out.println(Color.GREEN);
        System.out.println("More enum color" + Color.YELLOW);

        // Enum has a unique id
        System.out.println(Color.RED.ordinal());

        // Convert enum to string
        System.out.println(Color.RED.name());

        // Convert string to enum
        System.out.println(Color.valueOf("RED"));

        // Loop all enum values
        for (Color c : Color.values()) {
            System.out.println(c);
        }

        // Used enum in comparator
        if (color == Color.RED) {
            System.out.println("Color is RED");
        }

        // Use enum as HashMap key
        HashMap<Color, Integer> map = new HashMap<>();
        map.put(Color.RED, 99);
        map.put(Color.GREEN, 77);
        System.out.println(map);

        // Using enum in a type
        Car car = new Car(Color.RED);
        System.out.println(car);
        car.setColor(Color.YELLOW);
        System.out.println(car);

        // Advance enum type
        CarType carType = CarType.HONDA_ACCORD;
        System.out.println(carType);

        // Use enum without type prefix
        // Note: you can't do this with default package enum, it must from a real package.
        ArrayList<MyColor> myColors = new ArrayList<>(List.of(ORANGE, PURPLE));
        System.out.println(myColors);
    }

    // Simple enum type
    public static enum Color {
        RED, GREEN, YELLOW;
    }

    public static class Car {
        public Color color;

        public Car() {
        }

        public Car(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    // Complex enum type
    public static enum CarType {
        HONDA_ACCORD("Honda", "Accord"),
        HONDA_ODYSSEY("Honda", "Odyssey"),
        TOYOTA_CARMY("Toyota", "Carmy"),
        TOYOTA_SIENNA("Toyota", "Sienna")
        ;

        // Property should be private
        private String brand;
        private String model;

        // Enum constructor should not e public
        private CarType(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public String toString() {
            return "CarType{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    }
}
