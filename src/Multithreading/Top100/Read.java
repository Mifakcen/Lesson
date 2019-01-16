package Multithreading.Top100;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class  Read {
   public static List<String> readfale(File text) throws IOException {
        List<String> lines = Files.readAllLines(text.toPath());
        System.out.println( "Строк "+lines.size());
        List<String> words = new ArrayList<>();
        System.out.println(words.size());
        for (String line : lines) {
            String[] wordSplit =
                    line.toLowerCase()
                            .replaceAll("\\p{Punct}", " ")
                            .trim()
                            .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }
        return words;
    }
}