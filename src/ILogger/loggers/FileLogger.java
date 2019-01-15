package ILogger.loggers;

import ILogger.ILogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger{
    File file = new File("FileLogger.txt");

    @Override
    public void write(String text) {
        try( FileWriter writer = new FileWriter(file)) {
            file.createNewFile();

            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
