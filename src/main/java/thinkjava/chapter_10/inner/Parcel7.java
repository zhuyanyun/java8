package thinkjava.chapter_10.inner;

import thinkjava.chapter_10.change.Contents;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 08:59
 * @Vertion 1.0
 **/
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    };

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
        System.out.println(contents.value());
    }
}
