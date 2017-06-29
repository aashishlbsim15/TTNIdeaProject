package JAVA8;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by hackerfreak on 27/6/17.
 */
class ReflectionClass{
    private int member1;
    int member2;
    private void display(){
        System.out.println("I am a private method");
    }
    void show(){
        System.out.println("I am default Method");
    }
}


public class Ques3 {
    public static void main(String[] args) {
        Class c;
        ReflectionClass rf=new ReflectionClass();
        c=rf.getClass();
        System.out.println(c.getName());
        Field f[]=c.getDeclaredFields();
        Method m[]=c.getDeclaredMethods();
        for (Field a:f) {
            System.out.println(a);
        }
        for (Method x:m
             ) {
            System.out.println(x);
        }
        System.out.println();
    }

}
