import interfacepackages.Engine; // Importing Engine interface
import enginespackages.ElectricEngine; // Importing ElectricEngine class
import enginespackages.PetrolEngine; // Importing PetrolEngine class

public class MainApp {
    // Main class
    public static void main(String[] args) {

        //creating engines to be used
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();
        
        //passing different engines to the car
        Car electricCar = new Car(electricEngine);
        Car petrolCar = new Car(petrolEngine);

        // start cars with different engines
        electricCar.start();
        petrolCar.start();
    }
}
