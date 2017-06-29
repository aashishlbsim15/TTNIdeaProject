import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by hackerfreak on 20/6/17.
 */
public class Ques9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream("/home/hackerfreak/Desktop/list.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        StringBuilder s=new StringBuilder("");
        int i;
        while((i=bufferedInputStream.read())!=-1)
        {
            s.append((char)i);
        }
        bufferedInputStream.close();
        fileInputStream.close();
        System.out.println(s);
    }
}
