package collQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by hackerfreak on 22/6/17.
 */
class Student{
    private double roll_no;
    private double score;
    private String name;

    Student(double roll_no, double score, String name) {
        this.roll_no = roll_no;
        this.score = score;
        this.name = name;
    }

    public double getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(double roll_no) {
        this.roll_no = roll_no;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Comparatorstd implements Comparator<Student>
{

    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getScore()>student2.getScore())
            return 1;
        else if(student1.getScore()<student2.getScore())
            return -1;
        else {
            return student1.getName().compareTo(student2.getName());
        }
    }
}
public class ques5 {
    public static void main(String[] args) {
        Student e1=new Student(23,75,"rajesh");
        Student e2=new Student(23,65,"suresh");
        Student e3=new Student(24,65,"ramesh");
        Student e4=new Student(21,50,"mahesh");
        Student e5=new Student(25,95,"akshay");
        ArrayList empAl=new ArrayList<>();
        empAl.add(e1);
        empAl.add(e2);
        empAl.add(e3);
        empAl.add(e4);
        empAl.add(e5);
        Iterator<Student> empItr=empAl.iterator();
        System.out.println("before sorting");
        while (empItr.hasNext())
        {
            Student e=empItr.next();
            System.out.println("name: "+e.getName()+" "+"roll_no: "+e.getRoll_no()+" "+"score: "+e.getScore());
        }
        Collections.sort(empAl,new Comparatorstd());
        empItr=empAl.iterator();
        System.out.println("After sorting");
        while (empItr.hasNext())
        {
            Student e=empItr.next();
            System.out.println("name: "+e.getName()+" "+"roll_no: "+e.getRoll_no()+" "+"score: "+e.getScore());
        }


    }
}
