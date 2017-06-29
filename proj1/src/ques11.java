/**
 * Created by hackerfreak on 20/6/17.
 */
public class ques11 {

    public static void main(String[] args) {
        Addition I=new Addition();
        I.add(2,3);
        I.add(2.5,3.5);
        Multiplication multiplication=new Multiplication();
        multiplication.mul(3,5);
        multiplication.mul(3.5f,2.5f);
        StringOperation SO=new StringOperation();
        SO.concat("shubham","verma","TTN");

    }

}
class Addition{

    public void add(int x,int y)
    {

        System.out.println(x+y);
    }
    public void add(double x,double y)
    {


        System.out.println(x+y);
    }
}
class Multiplication{
    public void mul(int x,int y)
    {
        System.out.println(x*y);
    }
    public void mul(float x,float y)
    {
        System.out.println(x*y);
    }
}
class StringOperation{
    public void concat(String a,String b){
        StringBuilder sb=new StringBuilder(a);
        sb.append(b).toString();
        System.out.println(sb);
    }public void concat(String a,String b,String c){
        StringBuilder sb=new StringBuilder(a);
        sb.append(b).toString();
        sb.append(c).toString();
        System.out.println(sb);
    }
}