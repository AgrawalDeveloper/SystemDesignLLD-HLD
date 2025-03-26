package NULLObjectDesignPattern;

public class MainClass {

    public static void main(String str[])
    {
        FactoryDesignForVehicle factoryDesignForVehicle=new FactoryDesignForVehicle();

        System.out.println(factoryDesignForVehicle.getVehicle("Biker").getSpeed());
        System.out.println(factoryDesignForVehicle.getVehicle("Bike").getTankSize()); }

}
