package LLDChainOfResponsibilityLogging;

public class Main {
    public static void main(String agr[])
    {
        LogProcessor logProcessor=new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));

        logProcessor.log(1,"Getting error message");
        logProcessor.log(2,"Getting error message");
        logProcessor.log(3,"Getting error message");
    }
}
