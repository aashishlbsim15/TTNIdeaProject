package JAVA8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Created by hackerfreak on 27/6/17.
 */

class EmployeeNew{
    String name;
    int age;
}


public class Ques6 {
    public static  void evaluate(ArrayList<EmployeeNew> list, Predicate<EmployeeNew> p)
    {
        for(EmployeeNew employee:list){
            if(p.test(employee))
            {
                System.out.println("Name:"+employee.name);
                System.out.println("Name:"+employee.age);

            }
        }
    }
    public static void main(String[] args) {

        Random r=new Random();
        ArrayList<EmployeeNew> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            EmployeeNew emp=new EmployeeNew();
            emp.age=r.nextInt(15)+20;
            emp.name="";
            list.add(emp);
        }
        Scanner s=new Scanner(System.in);
        for (EmployeeNew e:list
             ) {
            System.out.println("enter the name");
            String s1=s.nextLine();
            e.name=e.name+s1;

        }
        evaluate(list,(employee)->{
            String name=employee.name;
            if(name.startsWith("n"))
            {
                if(employee.age>24)
                {
                    System.out.println("returning true");
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        });
    }
}
