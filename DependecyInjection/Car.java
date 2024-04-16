import interfacepackages.Engine; // Importing Engine interface

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine; //dependecy inejction using constructor
    }

    public void start() {
        engine.start(); // Using provided engine
        System.out.println("Car started...");
    }
}
