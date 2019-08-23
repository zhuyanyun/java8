package thinkjava.chapter_10.inner;

import thinkjava.chapter_10.change.Destination;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 09:19
 * @Vertion 1.0
 **/
public class Parcel9 {
    public Destination destination(String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination kkkk = parcel9.destination("KKKK");
        System.out.println(kkkk.readLabel());
    }
}
