import java.util.Scanner;

/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques4 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int lowerCaseCount=0;
        int upperCaseCount=0;
        int digit=0;
        int special=0;
        double lowerCasePercent,upperCasePercent,digitPercent,specialCharPercent;
        char Char;
        for(int i=0;i<input.length();i++)
        {
            Char=input.charAt(i);
            if (Character.isUpperCase(Char)){
                upperCaseCount++;
            } else if (Character.isLowerCase(Char)){
                lowerCaseCount++;
            } else if (Character.isDigit(Char)){
                digit++;
            } else{
                special++;
            }
        }


        lowerCasePercent=(lowerCaseCount*100)/input.length();
         upperCasePercent=(upperCaseCount*100)/input.length();
         digitPercent=(digit*100)/input.length();
         specialCharPercent=(special*100)/input.length();

        System.out.println("upper case count is : "+upperCaseCount+" and percentage is: "+ upperCasePercent);
        System.out.println("lower case count is : "+lowerCaseCount+" and percentage is: "+ lowerCasePercent);
        System.out.println("digit count is : "+digit+" and percentage is: "+ digitPercent);
        System.out.println("special char count is : "+special+" and percentage is: "+ specialCharPercent);



    }
}
