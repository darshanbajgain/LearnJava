package enginespackages;
import interfacepackages.Engine; // Importing Engine interface

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }
}
