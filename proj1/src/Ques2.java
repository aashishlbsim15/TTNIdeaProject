import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques2 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");
        Map<String, String> wordMap = new HashMap<String, String>();
        Map<String, String> printedMap = new HashMap<String, String>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toUpperCase();
            if (wordMap.get(word) != null) {

                if (printedMap.get(word) == null) {
                    System.out.println("Duplicated/Repeated word:" + word);

                    printedMap.put(word, word);

                }
            } else {

                wordMap.put(word, word);

            }

        }
    }
}