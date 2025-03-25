package LLDChainOfResponsibilityLogging;

public class LogProcessor {

    LogProcessor logProcessor;
    int INFO=1;
    int DEBUG=2;
    int ERROR=3;

    public LogProcessor(LogProcessor logProcessor)
    {
        this.logProcessor=logProcessor;
    }

    public void log(int logLevel,String message )
    {
        if(logProcessor==null) return;
        logProcessor.log(logLevel,message);
    }
}
