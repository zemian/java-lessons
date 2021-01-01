package zemian.commontasks.designpatterns.factory;

public class EngineFactory {
    public static Engine createEngine(EngineType type) {
        switch (type) {
            case CAR:
                return new Car();
            case BOAT:
                return new Boat();
            case TRUCK:
                return new Truck();
        }
        throw new RuntimeException("Invalid type " + type);
    }
}
