import java.util.Scanner;

/**
 * Created by hackerfreak on 20/6/17.
 */
public class Ques8 {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner scanner=new Scanner(System.in);
        String StringToReverse=scanner.nextLine();
        System.out.println(StringToReverse);
        String reversed=new StringBuffer(StringToReverse).reverse().toString();
        System.out.println(reversed);
        String removedChar=new StringBuffer(new StringBuffer(reversed).deleteCharAt(4).toString())
                .deleteCharAt(9).toString();
        System.out.println(removedChar);
    }
}
