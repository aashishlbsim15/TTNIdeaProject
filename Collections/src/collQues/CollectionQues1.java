package collQues;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by hackerfreak on 20/6/17.
 */
public class CollectionQues1 {

    public static void main(String[] args) {
        int i=5;
        double sum=0;
        ArrayList<Float> arrayListFloat=new ArrayList<Float>();
        Random r=new Random();
        while(i>0){
            arrayListFloat.add(r.nextFloat());
            i--;
        }
        System.out.println(arrayListFloat);
        ListIterator listIterator=arrayListFloat.listIterator();
        while(listIterator.hasNext())
        {
           sum=sum+ ((Float) listIterator.next());
        }
        System.out.printf("%f",sum);
    }
}
