package NULLObjectDesignPattern;

public class Bike implements Vehicles {

    @Override
    public int getSpeed()
    {
        return 60;
    }
    @Override
    public int getTankSize()
    {
        return 10;
    }
}
