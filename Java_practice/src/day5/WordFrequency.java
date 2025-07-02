package day5;
import java.util.HashMap;

public class WordFrequency {

    public static void main(String[] args) {
        String str = "The day today is very very very long day";
        String[] arr = str.split(" ");
        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : arr) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // Print the frequency of each word
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }
    }
}
