package Многопоточность.Top_100;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class My_Thread extends Thread {

    public int posihion;
    public int step;
    public List<String> listWord;
    Map<String, Integer> word;// = new HashMap<>();

    public Map<String, Integer> getWord() {
        return word;
    }

    public My_Thread(int posihion, int step, List<String> Listword,Map<String,Integer> word ){
        this.posihion=posihion*step;
        this.step=step;
        this.listWord=Listword;
        this.word=word;
    }



    @Override
    public void run() {

        System.out.println("posihion = "+ posihion+" step "+step);
        for (int i = posihion;i<posihion+step;i++) {
            //System.out.println(listWord.get(i));
            synchronized (Main.class) {
                if (word.containsKey(listWord.get(i))) {
                    word.put(listWord.get(i), word.get(listWord.get(i)) + 1);
                } else
                    word.put(listWord.get(i), 1);
            }
        }

      //  System.out.println( word.size());
        //System.out.println(word.toString());

    }
}