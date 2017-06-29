package JAVA8;

import java.io.*;
import java.util.Scanner;

/**
 * Created by hackerfreak on 26/6/17.
 */
class Employee implements Serializable{
    String EmployID;
    String EmployeeName;

    public String getEmployID() {
        return EmployID;
    }

    public Employee setEmployID(String employID) {
        EmployID = employID;
        return this;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public Employee setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
        return this;
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmployeeName("ramesh").setEmployID("007");
        try {
            ObjectOutputStream oos=new ObjectOutputStream
                    (new FileOutputStream("/media/hackerfreak/New Volume/UbuntuWorkSpace/ttn boot camp/JAVA CORE/ObjSerial.txt"));
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner s=new Scanner(System.in);
        System.out.println("press 1 to deserialize");
        int x=s.nextInt();
        if(x==1)
        {
            try {
                ObjectInputStream oio=new ObjectInputStream(new FileInputStream("/media/hackerfreak/New Volume/UbuntuWorkSpace/ttn boot camp/JAVA CORE/ObjSerial.txt"));
                try {
                   Employee DEmp=(Employee) oio.readObject();
                    System.out.println("Deserialized Object is "+DEmp.getEmployID()+"\n"+DEmp.getEmployeeName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
