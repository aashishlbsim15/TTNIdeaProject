package JAVA8;

import javax.jws.soap.SOAPBinding;

/**
 * Created by hackerfreak on 27/6/17.
 */
interface MyInterface{
    default void show(){
        System.out.println("show is called");
    }
    static int returnVal(String  x){
        return x.length();
    }
}
public class Ques5 implements MyInterface {
    public static void main(String[] args) {
        System.out.println(MyInterface.returnVal("Shubham Verma"));

        MyInterface myInterface=new MyInterface() {
            @Override
            public void show() {
                MyInterface.super.show();
            }
        };
        myInterface.show();

    }
}
