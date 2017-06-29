package collQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by hackerfreak on 21/6/17.
 */
class Employee{
    private double age;
    private double salary;
    private String name;

    public void setAge(double age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }



    Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

}
class ComparatorEmp implements Comparator<Employee>
{

    @Override
    public int compare(Employee employee, Employee t1) {
        if (employee.getSalary()==t1.getSalary())
            return 0;
        else if (employee.getSalary()>t1.getSalary())return 1;
        else {return -1;}
    }
}
public class ques4 {
    public static void main(String[] args) {
        Employee e1=new Employee(23,30000,"rajesh");
        Employee e2=new Employee(23,20000,"suresh");
        Employee e3=new Employee(24,40000,"ramesh");
        Employee e4=new Employee(21,25000,"mahesh");
        Employee e5=new Employee(25,15000,"akshay");
        ArrayList empAl=new ArrayList<>();
        empAl.add(e1);
        empAl.add(e2);
        empAl.add(e3);
        empAl.add(e4);
        empAl.add(e5);
        Iterator<Employee> empItr=empAl.iterator();
        System.out.println("before sorting");
        while (empItr.hasNext())
        {
            Employee e=empItr.next();
            System.out.println("name: "+e.getName()+" "+"age: "+e.getAge()+" "+"salary: "+e.getSalary());
        }
        Collections.sort(empAl,new ComparatorEmp());
        empItr=empAl.iterator();
        System.out.println("After sorting");
        while (empItr.hasNext())
        {
            Employee e=empItr.next();
            System.out.println("name: "+e.getName()+" "+"age: "+e.getAge()+" "+"salary: "+e.getSalary());
        }


    }
}
