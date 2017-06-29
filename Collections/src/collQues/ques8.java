package collQues;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hackerfreak on 22/6/17.
 */
public class ques8 {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("dd-MMMM-yyyy");

        System.out.println("formated date is :"+format.format(date));
    }
}
