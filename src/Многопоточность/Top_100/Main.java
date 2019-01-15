package Многопоточность.Top_100;

//Задачки:
//        1. Необходимо выполнить подсчет топ 100 слов параллельно.
// Количество потоков должно быть равно числу доступных процессоров в системе (Runtime.getRuntime().availableProcessors()).
// Каждый поток собирает свой результат (Map), а потом сливает в общий (Map). Первый поток, который создавал другие треды должен ожидать
// их завершения с помощью метода join() и выводить результат.
//
//        Не забывайте использовать синхронизацию при доступе к общим ресурсам.
//
//       Потокобезопасные коллекции не использовать!

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("wp.txt");
        List<String> words = Read.readfale(file);

        System.out.println("Слов "+words.size());
       // System.out.println(words.toString());
        System.out.println( "Число доступных процессоров в системе "+Runtime.getRuntime().availableProcessors());

        int aA = words.size()/Runtime.getRuntime().availableProcessors();

        System.out.println("число слов одного потока "+(aA));

        List<Thread> MyTrhead = new ArrayList<>();

        Map<String,Integer>MyMap = new HashMap<>();
MyMap.put("Warand",1);

        for (int i =0;i <Runtime.getRuntime().availableProcessors();i++){
            MyTrhead.add( new My_Thread(i,aA,words,MyMap));
        }
        for (Thread i:MyTrhead){
            i.start();
        }
        for (Thread i:MyTrhead) {
            i.join();
        }
        System.out.println(MyMap.toString());
    }
}
