import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args){
// Первое задание        
         String[] words = {
            "apple", "banana", "orange", "apple", "kiwi",
            "banana", "grape", "orange", "apple", "peach",
            "grape", "melon", "peach", "kiwi", "banana"
        };

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}