package collQues;

import java.util.*;

/**
 * Created by hackerfreak on 22/6/17.
 */
class KeyComparator implements Comparator<HashMap<Integer,Integer>>{



    @Override
    public int compare(HashMap<Integer, Integer> integerIntegerHashMap, HashMap<Integer, Integer> t1) {

       Map.Entry m= (Map.Entry) integerIntegerHashMap.keySet();
       Map.Entry m2= (Map.Entry) t1.keySet();
       if((Integer)m.getValue()>(Integer) m2.getValue())return -1;
       else if((Integer)m.getValue()==(Integer) m2.getValue()){
            return 0;
       }
       else {return 1;}
    }

    @Override
    public Comparator<HashMap<Integer, Integer>> reversed() {
        return null;
    }
}
public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int noOfEl=scanner.nextInt();
        Integer array[]=new Integer[noOfEl];
        for(int i=0;i<noOfEl;i++){
            array[i]=scanner.nextInt();
        }


        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (Integer c:array) {
            if (hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);

            }
        }
        for (Map.Entry m:hashMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

        }
        //Collections.sort(hashMap,new KeyComparator());
    }
}
