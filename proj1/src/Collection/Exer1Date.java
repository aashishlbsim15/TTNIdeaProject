package Collection;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by hackerfreak on 20/6/17.
 */
public class Exer1Date {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        while (true)
        {
            if (gregorianCalendar.isLeapYear(gregorianCalendar.get(Calendar.YEAR)))
            {
                System.out.println(gregorianCalendar.get(Calendar.YEAR));
                break;
            }
            gregorianCalendar.add(Calendar.YEAR,1);
        }
    }
}
