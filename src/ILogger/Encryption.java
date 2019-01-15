package ILogger;

public class Encryption {
    private ILogger iLogger;

    public Encryption(ILogger iLogger) {
        this.iLogger = iLogger;
    }
    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }
    public void write(String text) {
         iLogger.write(text);
    }
}
