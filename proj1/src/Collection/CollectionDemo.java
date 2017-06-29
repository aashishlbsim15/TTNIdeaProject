package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SimpleTimeZone;

/**
 * Created by hackerfreak on 20/6/17.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        List<String> stringList=new ArrayList<>();
        List<String> stringList2=new ArrayList<>();
        stringList.add("hello be");
        stringList.add("as be");
        stringList.add("asd be");
        stringList.add("dfd a be");
        stringList.add("sad be");
        stringList.add("xzxc be");
        stringList.add("sdfs be");
        stringList2.add("shubham");
        stringList2.add("shubham");
        stringList.addAll(stringList2);
        System.out.println(stringList);
        System.out.println(stringList2);
        stringList2.remove("shubham");
        System.out.println(stringList2);
        System.out.println(stringList);
        Iterator<String> myIt=stringList2.iterator();
        while (myIt.hasNext())
        {
            String x=myIt.next();
            myIt.remove();
            //System.out.println(x);
        }
    }
}
