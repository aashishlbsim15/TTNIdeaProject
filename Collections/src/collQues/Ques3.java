package collQues;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hackerfreak on 21/6/17.
 */
public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String input=scanner.nextLine();
        returnOccurances(input);
    }
    static void returnOccurances(String testerString)
    {
        int i=0;
        char[] array=testerString.toLowerCase().toCharArray();
        Character arr[]=new Character[array.length];
        for (char c:array) {
            arr[i++]=c;
        }
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (Character character:arr) {
            if (hashMap.containsKey(character))
            {
                hashMap.put(character,hashMap.get(character)+1);
            }
            else {
                hashMap.put(character,1);
            }
        }
        for (Map.Entry m:hashMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
