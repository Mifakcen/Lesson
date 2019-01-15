package ILogger.loggers;

import ILogger.ILogger;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class TimeFileLogger implements ILogger {
    @Override
    public void write(String text) {
        File file = new File("FileLoggerTime.txt");
        Date date = new Date();
        try (FileWriter writer = new FileWriter(file)) {
            file.createNewFile();
            writer.write(date +"\n" + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
