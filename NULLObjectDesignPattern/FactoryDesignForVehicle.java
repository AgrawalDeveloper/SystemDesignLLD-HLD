package NULLObjectDesignPattern;

public class FactoryDesignForVehicle {

    public Vehicles getVehicle(String vehicleType)
    {
        if(vehicleType.equalsIgnoreCase("Bike"))
        {
            return new Bike();
        }
        else if(vehicleType.equalsIgnoreCase("Car"))
        {
            return new Car();
        }
        return new NullObject();
    }
}
