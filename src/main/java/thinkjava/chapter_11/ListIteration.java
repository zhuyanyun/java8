package thinkjava.chapter_11;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zyy on 19/8/24.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        ListIterator<Integer> iterator = (ListIterator<Integer>) integers.iterator();
        ListIterator<Integer> it = integers.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next() + "," + it.nextIndex() + "," + it.previousIndex());
//        }

//        while (it.hasPrevious()){
//            System.out.println(it.previous() + "");
//        }

        ListIterator<Integer> iterator = integers.listIterator(3);
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
