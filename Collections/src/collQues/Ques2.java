package collQues;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by hackerfreak on 21/6/17.
 */
public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String input=scanner.nextLine();
        System.out.println("the unique characters are as follows\n"+(input=returnUnique(input)));
    }
    public static String returnUnique(String inputString)
    {
        char[] array=inputString.toCharArray();
        LinkedHashSet<Character> tester=new LinkedHashSet<Character>();
        Iterator arrIt;
        Character arr[]=new Character[array.length];
        for(int i=0;i<arr.length;i++)
            arr[i]=array[i];
        for (Character x:arr) {
            if(tester.contains(x))
            {
            tester.remove(x);
            }
            else {
                tester.add(x);
            }

        }
        arrIt=tester.iterator();
        String x="";
       while (arrIt.hasNext())
       {
           x=x+arrIt.next();
       }
        return x;

    }

}
