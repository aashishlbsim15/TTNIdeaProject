/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques7 {
    static {
        System.out.println("shubham");
    }
    public static void main(String[] args) {

        StaticDemo.DisplayLastName();
        System.out.println(StaticDemo.age);
    }
    static class StaticDemo{
        static int age=23;
        static String last_name="verma";
        public static void DisplayLastName(){
            System.out.println(last_name);
        }

    }
}

