package JAVA8;

import java.util.Scanner;

/**
 * Created by hackerfreak on 27/6/17.
 */
@FunctionalInterface
interface Lambda{
    public void ComputeTable(int y);
}
public class Ques4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int x=s.nextInt();
        Lambda lambda = (int y) -> {
            y=2;
            for (int i=1;i<=10;i++)
                System.out.println(y+" x "+i+" = "+(y*i));
        };
        lambda.ComputeTable(x);
    }
}
