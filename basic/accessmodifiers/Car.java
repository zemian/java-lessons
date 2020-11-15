package accessmodifiers;

public class Car {
    public String color;
    private String vin;
    protected double price;
    protected boolean hasSpareTire;
    private int numOfWheels = 18;
    String dealer;

    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return "My car color is " + this.color;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }
}