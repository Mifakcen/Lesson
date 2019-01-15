package ILogger.loggers;

import ILogger.ILogger;

public class ConsoleLogger implements ILogger{
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
