package collQues;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hackerfreak on 22/6/17.
 */
public class ques9 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language  in Switzerland Format : "+ df.format(d1));
    }
}
