/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques6 {
    public static void main(String[] args) {
        int []array={1,1,2,2,3,3,4,5,5};
        int Unique=array[0];
        for(int i=1;i<array.length;i++) {

            Unique = Unique ^ array[i];
        }
        System.out.println(Unique);
    }
}
