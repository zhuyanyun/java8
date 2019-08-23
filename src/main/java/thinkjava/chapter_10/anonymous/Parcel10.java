package thinkjava.chapter_10.anonymous;

import thinkjava.chapter_10.change.Destination;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 09:30
 * @Vertion 1.0
 **/
public class Parcel10 {
    public Destination destination(String dest, float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100){
                    System.out.println("Over label");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        parcel10.destination("tas", 101.39F);
    }
}
