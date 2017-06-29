/**
 * Created by hackerfreak on 20/6/17.
 */
public class Ques10 {
    public static void main(String[] args) {
        for (HousePrices x:HousePrices.values()) {
            System.out.printf("price of "+x+" "+" "+x.getPrice()+"crore\n");
        }

    }
}
enum HousePrices{
        VILLA(2), Bunglow(3), PENTHOUSE(7);
        private int price;
    HousePrices(int i) {
        price=i;
    }
    int getPrice()
    {
        return price;
    }
}