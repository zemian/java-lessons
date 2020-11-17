package accessmodifiers;

public class Truck extends Car {

    private int loadCapacityInTon;

    public Truck(String color, int loadCapacityInTon) {
        // We must call parent constructor since it has argument
        super(color);

        this.loadCapacityInTon = loadCapacityInTon;
    }

    public int getLoadCapacityInTon() {
        //System.out.println(this.vin); // ERROR - can't access parent "private" property.

        // We can access "private" property in this class
        return loadCapacityInTon;
    }

    public double calculatePrice() {
        // We can access "protected" property'
        return this.price * 2;
    }

    public String getDealerLocation() {
        // We can access "default" property
        return "Location for dealer=" + this.dealer + " is hidden.";
    }
}