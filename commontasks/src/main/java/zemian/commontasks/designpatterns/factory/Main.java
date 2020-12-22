package zemian.commontasks.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            EngineType type = EngineType.valueOf(args[0]);
            Engine engine = EngineFactory.createEngine(type);
            System.out.println("engine " + engine);
            return;
        }
        System.out.println("Please give an engine type argument.");
    }
}
