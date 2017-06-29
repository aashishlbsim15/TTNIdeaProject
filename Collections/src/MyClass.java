

        import java.util.ArrayList;
        import java.util.List;
        import java.util.function.Predicate;

/**
 * Created by Shreya on 6/22/2017.
 */
public class MyClass {
    String Name;
    int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyClass(String name, int age) {
        Name = name;
        this.age = age;
    }
}

class Q6 {


    public static  void evaluate(List<MyClass> list, Predicate<MyClass> p)
    {
        for(MyClass n:list){
            if(p.test(n))
            {
                System.out.println("Name:"+n.getName());
                System.out.println("Name:"+n.getAge());

            }
        }
    }




    public static void main(String[] args) {

        MyClass e=new MyClass("shreya",22);
        MyClass e3=new MyClass("nitin",26);
        MyClass e1=new MyClass("nipun",28);
        MyClass e2=new MyClass("shaan",22);
        ArrayList<MyClass> elist=new ArrayList<>();
        elist.add(e);
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        evaluate(elist,(n)->{
            String name=n.getName();
            if(name.endsWith("n"))
            {
                if(n.getAge()>24)
                    return true;
                else
                    return false;
            }
            else
                return false;
        });

    }
}

