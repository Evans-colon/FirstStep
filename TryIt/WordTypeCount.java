package TryIt;

import java.util.*;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer>map){
        Scanner input =new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = input.nextLine();

        String[] tokens = sentence.split(" ");

        for (String token:tokens){
            String word = token.toLowerCase();
            if(map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }
                else
                    map.put(word, 1);
            }
        }

        private static void displayMap(Map<String, Integer>map){
            Set<String> Keys = map.keySet();
            TreeSet<String> sortedKeys = new TreeSet<>(Keys);
            System.out.printf("%nMap contains: %nKey\t\tValue%n");
            for(String key : sortedKeys)
                System.out.printf("%-10s%10s%n", key, map.get(key));
    }
}
