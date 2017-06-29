/**
 * Created by hackerfreak on 19/6/17.
 */
public class Inheritance {
    public static void main(String[] args) {
        A a=new A();
        a.print1();
        B b=new B();
        b.print1();
        A a1=new B();
        a1.print1();

    }

}
class A{
    static void print1(){
        System.out.println(" from a");
    }
}
class B extends A {
    static void print1() {
        System.out.println(" from b");
    }
}
