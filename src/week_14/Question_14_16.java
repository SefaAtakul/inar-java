package week_14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Question_14_16 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path : ");
        String path = input.nextLine();
        File file = new File(path);
        final List<String> lines = Files.readAllLines(Path.of(path));
        String text = String.valueOf(lines);
        StringTokenizer tkn = new StringTokenizer(text," .:;,?()-&=*{}[]/+!<>'\"",false);
        HashMap<String,Integer> words = new HashMap<>();
        while (tkn.hasMoreTokens()){
            String s = tkn.nextToken();
            words.put(s,words.getOrDefault(s,0)+1);
        }
        System.out.println("Word count:");
        for(Map.Entry<String,Integer> m : words.entrySet()){
            System.out.println(m.getKey() + ":\t" + m.getValue());
        }
    }
    }
