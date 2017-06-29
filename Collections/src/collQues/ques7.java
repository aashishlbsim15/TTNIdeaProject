package collQues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by hackerfreak on 22/6/17.
 */

class SpecialStack{
    int top;
   private LinkedList<Integer> linkedList;
    int min;
    int capacity;
    public SpecialStack(int x) {
        top=-1;
        linkedList=new LinkedList<>();
        capacity=x;
    }
    void push(Integer x){
        if(capacity==(top+1)){
            System.out.println("overflow");
        }
        else {
            if(isEmpty()){
                linkedList.addFirst(x);
                min=x;
                top++;
            }
            else{
                if(x<min)
                {
                    min=x;
                }
                linkedList.addFirst(x);
                top++;
            }
        }
    }
    void getMin()
    {
        System.out.println("currently minimum element is "+min);
    }
    void pop(){
        if(isEmpty())
        {
            System.out.println("element cant be poped stack undeflow");
        }
        else{
            System.out.println("poped element is"+linkedList.getFirst());
            if(linkedList.getFirst()==min)
            {
               int check,minimum;
                linkedList.removeFirst();
                minimum=linkedList.getFirst();
                Iterator li=linkedList.iterator();
                while (li.hasNext()){
                    check=(int)li.next();
                    if(check<minimum)
                        minimum=check;

                }
                min=minimum;
            }
            else{
            linkedList.removeFirst();
            top--;}
        }

    }
   private boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
   private boolean isFull()
    {
        if(top==capacity-1)
            return true;
        return false;
    }
    void listStatus(){
        System.out.println(linkedList);
    }
}
public class ques7 {
    public static void main(String[] args) {
        SpecialStack sp=new SpecialStack(12);
        sp.push(25);
        sp.push(35);
        sp.push(7);
        sp.push(50);
        sp.push(1);
        sp.getMin();
        sp.pop();
        sp.getMin();
        sp.pop();
        sp.getMin();
        sp.pop();
        sp.getMin();
        sp.listStatus();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
//        sp.pop();
    }
}
