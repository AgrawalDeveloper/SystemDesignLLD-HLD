package NULLObjectDesignPattern;

public class Car implements Vehicles {

    @Override
    public int getSpeed()
    {
        return 100;
    }
    @Override
    public int getTankSize()
    {
        return 50;
    }
}
