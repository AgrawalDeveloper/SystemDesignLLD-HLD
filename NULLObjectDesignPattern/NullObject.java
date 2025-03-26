package NULLObjectDesignPattern;

public class NullObject implements Vehicles {

    @Override
    public int getSpeed()
    {
        System.out.println("Getting null object");
        return 0;
    }
    @Override
    public int getTankSize()
    {
        System.out.println("Getting null object");
        return 0;
    }
}
