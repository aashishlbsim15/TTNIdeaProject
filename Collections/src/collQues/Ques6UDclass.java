package collQues;

import java.util.*;

/**
 * Created by hackerfreak on 22/6/17.
 */

class SortList{
    int value;
    int count;
    int index;

    public SortList(int value, int count,int index) {
        this.value = value;
        this.count = count;
        this.index=index;
    }
    public void incrementCount(){
        this.count+=1;
    }

    @Override
    public String toString() {
        return "SortList{" +
                "value=" + value +
                ", count=" + count +
                ", index=" + index +
                '}';
    }
}


public class Ques6UDclass {
    static class MyComp implements Comparator<SortList>{

        @Override
        public int compare(SortList sortList, SortList t1) {
            if(sortList.count>t1.count)return -1;
            else if(sortList.count<t1.count)return 1;
            else {
                if(sortList.index>t1.index)return 1;
                else{return -1;}
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int flag=0;
        int noOfEl=scanner.nextInt();
        Integer array[]=new Integer[noOfEl];
        for(int i=0;i<noOfEl;i++){
            array[i]=scanner.nextInt();
        }

        ArrayList<SortList> list=new ArrayList<>();
        ListIterator listIterator;
        for(int i=0;i<array.length;i++)
        {
            if(list.isEmpty())
        {
            list.add(new SortList(array[i],1,i));
        }
            else {

                listIterator=list.listIterator();
                while (listIterator.hasNext()){
                    SortList x= (SortList) listIterator.next();
                    if(x.value==array[i]){
                        x.incrementCount();
                        flag=1;
                        break;
                    }
                }

                if(flag!=1)
                {
                    list.add(new SortList(array[i],1,i));
                }
                flag=0;
            }
        }
        System.out.println(list);
        Collections.sort(list,new MyComp());
        System.out.println(list);

    }

}
