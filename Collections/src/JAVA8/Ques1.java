package JAVA8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by hackerfreak on 25/6/17.
 */
public class Ques1 {
    public static void main(String[] args) {
        int readChar = 0;
        File source = new File("/media/hackerfreak/New Volume/UbuntuWorkSpace/ttn boot camp/ques3.html");
        File destination = new File("/media/hackerfreak/New Volume/UbuntuWorkSpace/DBs/copy_ques3.html");
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(destination);
            fileInputStream = new FileInputStream(source);
            while ((readChar = fileInputStream.read()) != -1) {
                fileOutputStream.write((char) readChar);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
