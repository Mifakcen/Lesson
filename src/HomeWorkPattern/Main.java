package HomeWorkPattern;


import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Main {
    /*
    Задачи по паттернам
1. Используя паттерн Decorator создать шифрующие потоки ввода/вывода с помощью XOR (можете выбрать другой способ).
 Они должны наследовать FilterInputStream и FilterOutputStream.
Конструктор этих потоков должен принимать пароль в виде массива байт и поток, который он декорирует.

Использование должно выглядеть следующим образом:
Трафик автоматически шифрует и дешифруется:
InputStream in = new CryptoInputStream(socket.getInputStream(), password);
OutputStream out = new CryptoOutputStream(socket.getOutputStream(), password);

Сохраняем в шифрованный файл и читаем из шифрованного файла:
InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), password);
OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), password);

Для простоты можете начать имплементацию, где пароль - один байт.
     */

    public static void main(String[] args) throws IOException {

        byte[] password = {1, 2, 3, 4};

//        InputStream in = new MyFilterInputStream(new FileInputStream("file.txt"), password);
//        String str = new String( new byte[in.available()], UTF_8);
//        System.out.println(str);
//
//        OutputStream out = new MyFilterOutputStream(new FileOutputStream("file.txt"), password);

//
//        byte[] key = input.nextLine().getBytes(StandardCharsets.UTF_8);
//        System.out.println("Enter message");
//        byte[] message = input.nextLine().getBytes(StandardCharsets.UTF_8);


        MyFilterInputStream in = new MyFilterInputStream(new FileInputStream("file.txt"), password);
        MyFilterOutputStream out = new MyFilterOutputStream(new FileOutputStream("file2.txt"), password);

        byte[] answer = new byte[in.available()];

        in.read(answer);
        String strAnswer = new String(answer, StandardCharsets.UTF_8);
        System.out.println(strAnswer);

        out.write(answer);

        in.read(answer);
        strAnswer = new String(answer, StandardCharsets.UTF_8);
        System.out.println(strAnswer);


        in = new MyFilterInputStream(new FileInputStream("file2.txt"), password);
        answer = new byte[in.available()];


        in.read(answer);
        strAnswer = new String(answer, StandardCharsets.UTF_8);
        System.out.println(strAnswer);
    }
}
