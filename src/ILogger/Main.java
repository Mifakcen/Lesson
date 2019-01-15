package ILogger;

import ILogger.loggers.ConsoleLogger;
import ILogger.loggers.FileLogger;
import ILogger.loggers.TimeFileLogger;

import java.io.FileWriter;

public class Main {



    /*
        Самостоятельно изучить паттерн Стратегия. Реализовать Logger.
    1. Интерфейс ILogger с мотодом write()
    2. Реализовать три стратегии:
    ConsoleLogger - выводит сообщения в консоль
    FileLogger - записывает сообщение в файл
    TimeFileLogger - записывает сообщение в файл + текущее время
    3. Реализовать классы, исползующие эти стратегии.
    Запись в файл должна работать!
    */
    public static void main(String[] args) {
        String text = "021321321/23132123/1231231321/kjbhkjbkj";
        Encryption encryption = new Encryption(new  FileLogger());
        encryption.write(text);
        encryption.setiLogger(new ConsoleLogger());
        encryption.write(text);
    }
}
