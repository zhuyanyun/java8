package thinkjava.chapter_5.staticdata;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-17 14:18
 * @Vertion 1.0
 **/
public class Table {
    static Bowl bowl1 = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
