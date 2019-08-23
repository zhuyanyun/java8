package thinkjava.chapter_10.change;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 08:45
 * @Vertion 1.0
 **/
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        System.out.println(contents.value());

        Destination d = parcel4.destination("Tsamania");

//        parcel4.new PC
    }
}
