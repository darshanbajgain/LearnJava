package enginespackages;
import interfacepackages.Engine; // Importing Engine interface

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Petrol Engine");
    }
}