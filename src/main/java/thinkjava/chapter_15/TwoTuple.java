package thinkjava.chapter_15;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-30 11:30
 * @Vertion 1.0
 **/
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A a,B b){
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<>("aaa", 1);
//        twoTuple.first = "bbb";
    }
}
