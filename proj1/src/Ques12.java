/**
 * Created by hackerfreak on 20/6/17.
 */
public class Ques12 {
    public static void main(String[] args) {
        System.out.println(Bank.getDetails());
        System.out.println(BOI.getDetails());
        System.out.println(ICICI.getDetails());
        System.out.println(SBI.getDetails());
    }
}
class Bank{
    static public int getDetails(){
        return 0;
    }
}
class SBI extends Bank{
    static int roi=20;
   static public int getDetails()
    {
        return roi;
    }

}
class BOI extends Bank{
    static int roi=15;
   static public int getDetails()
    {
        return roi;
    }

}
class  ICICI extends Bank{
    static int roi=25;
   static public int getDetails()
    {
        return roi;
    }

}