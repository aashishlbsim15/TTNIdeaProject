import java.util.Scanner;

/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques3 {
    public static void main(String[] args) {
        char c;
        Scanner scanStr=new Scanner(System.in);
        String countOccurance=scanStr.nextLine();
        countOccurance.toLowerCase();
        System.out.println("enter the char");
        c=scanStr.nextLine().charAt(0);
        System.out.println(
                countOccurance.length()-countOccurance.replaceAll(String.valueOf(c),"").length());;
    }

}
