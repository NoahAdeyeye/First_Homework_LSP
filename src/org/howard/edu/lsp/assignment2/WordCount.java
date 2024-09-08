package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {

        String filename = "words.txt";  
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                WordCount.class.getResourceAsStream(filename)))) {

            String line;
            while ((line = br.readLine()) != null) {
                
                String[] words = line.split("[^a-zA-Z]+");
                
                for (String word : words) {
                    if (word.length() > 3) {  
                        word = word.toLowerCase();  
                        
                        
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("File not found: " + filename);
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
