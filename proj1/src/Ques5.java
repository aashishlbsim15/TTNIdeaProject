/**
 * Created by hackerfreak on 19/6/17.
 */
public class Ques5 {
    public static void main(String[] args) {
        int []array= {12,13,26,24,58,96,45};
        int []array1= {96,20,24,30,40,13,50};
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array1.length;j++)
            {
                if(array[i]==array1[j])
                    System.out.println("duplicate element found "+array[i]);
            }
        }
    }
}
