package com.streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordsinAFile {
	public static void main(String[] args) {

        String filePath = "src/com/streams/source.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        //Reading file and counting words
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = br.readLine()) != null) {

                String[] words = line.toLowerCase().split("\\W+");

                for(String word:words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        }catch (IOException e) {
            System.out.println("Error while reading file.");
        }

        //Sorting words by frequency
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 5 most frequent words:");
        for(int i=0; i<Math.min(5, list.size()); i++) {
  
            System.out.println(list.get(i).getKey()+" : "+list.get(i).getValue());
        }
    }
}
